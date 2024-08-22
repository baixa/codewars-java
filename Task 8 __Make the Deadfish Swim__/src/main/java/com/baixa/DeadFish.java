package com.baixa;

import java.util.ArrayList;
import java.util.List;

public class DeadFish {
    public static int[] parse(String data) {
        int currentValue = 0;
        List<Integer> values = new ArrayList<>();
        for (char c : data.toCharArray()) {
            switch (c) {
                case 'i':
                    currentValue++;
                    break;
                case 'd':
                    currentValue--;
                    break;
                case 's':
                    currentValue *= currentValue;
                    break;
                case 'o':
                    values.add(currentValue);
                    break;
            }
        }
        return values.stream().mapToInt(i -> i).toArray();
    }
}
