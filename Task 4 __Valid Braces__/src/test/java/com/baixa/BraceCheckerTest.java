package com.baixa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BraceCheckerTest {
    private final BraceChecker checker = new BraceChecker();

    @Test
    public void testValid() {
        assertTrue(checker.isValid("()"));
    }

    @Test
    public void testInvalid() {
        assertFalse(checker.isValid("[(])"));
    }

    @Test
    public void testValid1() {
        assertTrue(checker.isValid("(){}[]"));
    }

    @Test
    public void testValid2() {
        assertTrue(checker.isValid("([{}])"));
    }

    @Test
    public void testValid3() {
        assertTrue(checker.isValid("(({{[[]]}}))"));
    }

    @Test
    public void testInvalid1() {
        assertFalse(checker.isValid("(}"));
    }

    @Test
    public void testInvalid2() {
        assertFalse(checker.isValid("[(])"));
    }

    @Test
    public void testInvalid3() {
        assertFalse(checker.isValid("[({})](]"));
    }

    @Test
    public void testInvalid4() {
        assertFalse(checker.isValid("}}]]))}])"));
    }
}