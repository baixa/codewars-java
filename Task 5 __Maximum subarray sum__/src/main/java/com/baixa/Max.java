package com.baixa;

public class Max {

    public static int sequence(int[] arr) {
        int maxSoFar = Integer.MIN_VALUE, maxEndingHere = 0;

        for (int j : arr) {
            maxEndingHere += j;
            maxSoFar = Math.max(maxEndingHere, maxSoFar);
            maxEndingHere = Math.max(0, maxEndingHere);
        }

        return Math.max(maxSoFar, 0);
    }
}