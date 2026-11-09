/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.client;
import java.util.ArrayList;
import java.util.List;
/** Tokenizes local commands with quoted arguments and backslash escapes. */
public final class CommandLine {
    private CommandLine() {}
    public static List<String> parse(String input) {
        List<String> values = new ArrayList<>(); StringBuilder word = new StringBuilder();
        char quote = 0; boolean escape = false, started = false;
        for (int index = 0; index < input.length(); index++) {
            char c = input.charAt(index);
            if (escape) { word.append(c); escape = false; started = true; }
            else if (c == '\\') { escape = true; started = true; }
            else if (quote != 0) { if (c == quote) quote = 0; else word.append(c); }
            else if (c == '\'' || c == '"') { quote = c; started = true; }
            else if (Character.isWhitespace(c)) {
                if (started) { values.add(word.toString()); word.setLength(0); started = false; }
            } else { word.append(c); started = true; }
        }
        if (quote != 0 || escape) throw new IllegalArgumentException("Unclosed quote or escape in command");
        if (started) values.add(word.toString());
        return List.copyOf(values);
    }
}
