/* SPDX-License-Identifier: GPL-3.0-only */
package dev.meteorapi.setting;

public interface ValueCodec<T> {
    T decode(String text);
    String encode(T value);
}
