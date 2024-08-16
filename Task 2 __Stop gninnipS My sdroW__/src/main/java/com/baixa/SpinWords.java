package com.baixa;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SpinWords {
    public String spinWords(String sentence) {
        return Stream.of(sentence.split(" "))
                .map(s -> s.length() >= 5
                        ? new StringBuilder(s).reverse().toString()
                        : s)
                .collect(Collectors.joining(" "));
    }
}
