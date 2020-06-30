package com.rezkalla;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaStringTokensTest {

    @Test
    @DisplayName("Sample Test Case 1")
    public void testStringTokensWorkSuccessfullyTestCase1() {
        String str = "He is a very very good boy, isn't he?";
        String expected = "10\n" +
                "He\n" +
                "is\n" +
                "a\n" +
                "very\n" +
                "very\n" +
                "good\n" +
                "boy\n" +
                "isn\n" +
                "t\n" +
                "he";
        String actual = JavaStringTokens.getNumberOfTokens(str);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Sample Test Case 2")
    public void testStringTokensWorkSuccessfullyTestCase2() {
        String str = "Hello, thanks for attempting this problem! Hope it will help you to learn java! Good luck and have a nice day!";
        String expected = "21\n" +
                "Hello\n" +
                "thanks\n" +
                "for\n" +
                "attempting\n" +
                "this\n" +
                "problem\n" +
                "Hope\n" +
                "it\n" +
                "will\n" +
                "help\n" +
                "you\n" +
                "to\n" +
                "learn\n" +
                "java\n" +
                "Good\n" +
                "luck\n" +
                "and\n" +
                "have\n" +
                "a\n" +
                "nice\n" +
                "day";
        String actual = JavaStringTokens.getNumberOfTokens(str);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("simple test case for empty string  should return 0")
    public void testEmptyStringShouldReturnZero() {
        String expected = "0";
        String actual = JavaStringTokens.getNumberOfTokens("");
        assertEquals(expected, actual);
    }

    @Test
    public void testWrongStringShouldReturnInvalidResponse() {
        String expected = "3\n" +
                "Hello\n" +
                "World\n";
        String actual = JavaStringTokens.getNumberOfTokens("Hello World");
        assertNotEquals(expected, actual);
    }
}