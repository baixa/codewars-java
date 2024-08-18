package com.baixa;

import java.util.stream.IntStream;

public class RgbToHex {
    public static String rgb(int r, int g, int b) {
        int[] digits = IntStream.of(r, g, b)
                .map(i -> Math.max(i, 0))
                .map(i -> Math.min(i, 255))
                .toArray();
        return String.format("%02X%02X%02X", digits[0], digits[1], digits[2]);
    }
}
