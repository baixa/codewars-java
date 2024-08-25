package com.baixa;

import java.util.regex.Pattern;

public class PigLatin {

    private static final Pattern PUNCTUATION = Pattern.compile("\\p{Punct}");

    public static String pigIt(String str) {
        String[] words = str.split(" ");
        StringBuilder res = new StringBuilder();
        for (String word : words) {
            if (PUNCTUATION.matcher(word).matches()) {
                res.append(word);
                res.append(" ");
                continue;
            }
            if (word.length() > 1) {
                res.append(word.substring(1));
            }
            res.append(word.charAt(0));
            res.append("ay");
            res.append(" ");
        }
        return res.deleteCharAt(res.length()-1).toString();
    }
}
