package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WordRepetitionMapCreator {
    public static Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> wordRepetitionMap = new HashMap<>();
        String result = sentence.replaceAll("\\p{Punct}", "");
        String[] sentenceArr = result.split(" ");

        for (int i = 0; i < sentenceArr.length; i++) {
            String word = sentenceArr[i].toLowerCase();
            if (wordRepetitionMap.containsKey(word)) continue;
            wordRepetitionMap.put(sentenceArr[i].toLowerCase(), 1);

            for (int a = i + 1; a < sentenceArr.length; a++) {
                int count = 1;
                if (Objects.equals(word, sentenceArr[a].toLowerCase())) {
                    count++;
                    wordRepetitionMap.put(word, count);
                }
            }
        }

        return wordRepetitionMap;
    }

    public  static void main(String[] args) {
        String sentence = "caSE caSe sentence in caSE loWER caSE, lowER: SENTENCE IN loWER UPper CAse.";
        createWordRepetitionMap(sentence);
    }
}
