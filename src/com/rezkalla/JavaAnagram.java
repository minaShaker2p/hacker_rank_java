package com.rezkalla;

import java.util.HashMap;

public class JavaAnagram {
    static boolean isAnagram(String a, String b) {
        HashMap<Character, Integer> first = new HashMap<>();
        HashMap<Character, Integer> second = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            if (first.containsKey(a.charAt(i))) {
                int val = first.get(a.charAt(i)) + 1;
                first.put(Character.toLowerCase(a.charAt(i)), val);
            } else {
                first.put(Character.toLowerCase(a.charAt(i)), 1);
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if (second.containsKey(b.charAt(i))) {
                int val = second.get(b.charAt(i)) + 1;
                second.put(Character.toLowerCase(b.charAt(i)), val);
            } else {
                second.put(Character.toLowerCase(b.charAt(i)), 1);
            }
        }
        return first.equals(second);
    }
}
