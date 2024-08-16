package com.baixa;

import java.util.HashMap;
import java.util.Map;

public class Kata {
    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> res = new HashMap<>();
        for (char c : str.toCharArray()) {
            res.put(c, res.getOrDefault(c, 0) + 1);
        }
        return res;
    }
}
