package com.baixa;

import java.util.Map;
import java.util.Stack;

public class BraceChecker {

    final Map<Character, Character> BRACKET_PAIR = Map.of(
            '(', ')',
            '{', '}',
            '[', ']'
    );

    public boolean isValid(String braces) {
        Stack<Character> openBrackets = new Stack<>();
        for (int i = 0; i < braces.length(); i++) {
            if (BRACKET_PAIR.containsKey(braces.charAt(i))) {
                openBrackets.push(braces.charAt(i));
            } else if (openBrackets.isEmpty() || BRACKET_PAIR.get(openBrackets.pop()) != braces.charAt(i)) {
                return false;
            }
        }
        return openBrackets.isEmpty();
    }

}
