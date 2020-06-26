package com.rezkalla;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaAnagramTest {


    @Test
    @DisplayName("test that two strings are anagram")
    void testIsAnagram() {
        // Given
        String str1 = "anagram";
        String str2 = "margana";

        String str3 = "Hello";
        String str4 = "hello";
        //Action
        boolean actual1 = JavaAnagram.isAnagram(str1, str2);

        boolean actual2 = JavaAnagram.isAnagram(str3, str4);

        //Verify
        assertTrue(actual1);
        assertTrue(actual2);
    }

    @Test
    @DisplayName("test that two strings are  not anagram")
    void testIsNotAnagram() {
        // Given
        String str1 = "anagramm";
        String str2 = "marganaa";
        //Action
        boolean actual = JavaAnagram.isAnagram(str1, str2);
        //Verify
        assertFalse(actual);
    }

}