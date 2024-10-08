package com.baixa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxTest {
    @Test
    public void testEmptyArray() {
        assertEquals(0, Max.sequence(new int[]{}));
    }
    @Test
    public void testExampleArray() {
        assertEquals(6, Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}