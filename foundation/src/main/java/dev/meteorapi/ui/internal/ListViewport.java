/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.ui.internal;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

/** Internal panel model: visibility and search are applied before pagination. */
public final class ListViewport {
  public record Page<T>(List<T> items, int total, int offset) {
    public Page {
      items = List.copyOf(items);
    }
  }

  private ListViewport() {}

  public static <T> Page<T> select(
      List<T> source,
      Predicate<T> visible,
      Function<T, String> label,
      String query,
      int offset,
      int pageSize) {
    Objects.requireNonNull(source);
    Objects.requireNonNull(visible);
    Objects.requireNonNull(label);
    if (pageSize < 1) throw new IllegalArgumentException("Page size must be positive");
    String normalized = normalize(Objects.requireNonNull(query));
    String[] words = normalized.isEmpty() ? new String[0] : normalized.split("\\s+");
    List<T> matches = new ArrayList<>();
    for (T item : source) {
      if (!visible.test(item)) continue;
      String text = normalize(label.apply(item));
      boolean accepted = true;
      for (String word : words)
        if (!text.contains(word)) {
          accepted = false;
          break;
        }
      if (accepted) matches.add(item);
    }
    int start = Math.clamp(offset, 0, Math.max(0, matches.size() - pageSize));
    return new Page<>(
        matches.subList(start, Math.min(matches.size(), start + pageSize)), matches.size(), start);
  }

  private static String normalize(String text) {
    return Normalizer.normalize(text, Normalizer.Form.NFD)
        .replaceAll("\\p{M}+", "")
        .toLowerCase(Locale.ROOT)
        .replace('đ', 'd')
        .strip();
  }
}
