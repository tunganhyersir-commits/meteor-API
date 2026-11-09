/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.ui;

import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.util.tinyfd.TinyFileDialogs;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/** 26.3 SDL-dialog functionality adapted to 1.21.11's existing TinyFD native library. */
public final class FileDialogs {
    private static final ExecutorService WORKER = Executors.newSingleThreadExecutor(task -> {
        Thread thread = new Thread(task, "MeteorAPI-file-dialog"); thread.setDaemon(true); return thread;
    });
    private FileDialogs() {}
    public static CompletableFuture<Optional<Path>> openFile(String extensions) { return dialog(extensions, false); }
    public static CompletableFuture<Optional<Path>> saveFile(String extensions) { return dialog(extensions, true); }
    public static void openFile(String extensions, java.util.function.Consumer<? super java.io.File> onSelected) {
        callback(openFile(extensions), onSelected);
    }
    public static void saveFile(String extensions, java.util.function.Consumer<? super java.io.File> onSelected) {
        callback(saveFile(extensions), onSelected);
    }
    private static void callback(CompletableFuture<Optional<Path>> future, java.util.function.Consumer<? super java.io.File> onSelected) {
        future.whenComplete((selection, failure) -> {
            if (failure != null) dev.meteorapi.MeteorApi.LOG.warn("File dialog failed", failure);
            else selection.ifPresent(path -> dev.meteorapi.MeteorApi.execute(() -> onSelected.accept(path.toFile())));
        });
    }
    private static CompletableFuture<Optional<Path>> dialog(String extensions, boolean save) {
        if (extensions == null || extensions.length() > 256 || !extensions.matches("[A-Za-z0-9_*.;-]+"))
            return CompletableFuture.failedFuture(new IllegalArgumentException("Invalid file extension filter"));
        return CompletableFuture.supplyAsync(() -> {
            try (MemoryStack stack = MemoryStack.stackPush()) {
                String[] filters = extensions.split(";");
                PointerBuffer patterns = stack.mallocPointer(filters.length);
                for (String filter : filters) patterns.put(stack.UTF8(filter.equals("*") ? "*" : "*." + filter.replaceFirst("^\\*\\.", "")));
                patterns.flip();
                String chosen = save
                    ? TinyFileDialogs.tinyfd_saveFileDialog("Save file", "", patterns, extensions)
                    : TinyFileDialogs.tinyfd_openFileDialog("Open file", "", patterns, extensions, false);
                return Optional.ofNullable(chosen).map(Path::of);
            }
        }, WORKER);
    }
}
