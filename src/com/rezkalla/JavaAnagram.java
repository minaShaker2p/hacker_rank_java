package com.rezkalla;

import java.util.HashMap;

// How to compare two hash maps
// https://www.baeldung.com/java-compare-hashmaps
public class JavaAnagram {
    static boolean isAnagram(String a, String b) {
        HashMap<Character, Integer> first;
        HashMap<Character, Integer> second;

        first = fillMap(a);
        second = fillMap(b);

        return first.equals(second);
    }

    static HashMap<Character, Integer> fillMap(String word) {
        HashMap<Character, Integer> result = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            if (result.containsKey(word.charAt(i))) {
                int val = result.get(word.charAt(i)) + 1;
                result.put(Character.toLowerCase(word.charAt(i)), val);
            } else {
                result.put(Character.toLowerCase(word.charAt(i)), 1);
            }
        }
        return result;
    }
}
