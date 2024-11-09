package com.epam.mjc.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public static boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        return functionMap.containsValue(requiredValue);
    }

    private static Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        // value of function 5x+2
        Map<Integer, Integer> functionMap = new HashMap<>();
        for (Integer e : sourceList) {
            functionMap.put(e, 5 * e + 2);
        }
        return functionMap;
    }

    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>(List.of(2, 3, 5));
        isFunctionValuePresent(data, 26);
    }
}
