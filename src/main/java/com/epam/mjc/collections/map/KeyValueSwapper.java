package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public static Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> swappedMap = new HashMap<>();
        for (Map.Entry<Integer, String> e : sourceMap.entrySet()) {
            if (swappedMap.containsKey(e.getValue())) {
                if (e.getKey() > swappedMap.get(e.getValue())) continue;
            }
            swappedMap.put(e.getValue(), e.getKey());
        }

        return swappedMap;
    }

    public static void main(String[] args) {
        Map<Integer, String> sourceMap = Map.of(11, "one", 1, "one", 4, "one",2, "two", 3, "s");
        swap(sourceMap);
    }
}
