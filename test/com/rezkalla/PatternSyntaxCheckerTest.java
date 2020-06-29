package com.rezkalla;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatternSyntaxCheckerTest {

    @Test
    public void testRegexStringPatternShouldBeValid()
    {
     String input ="[A-Za-z0-9]";
     String expected="Valid";
     String actual =PatternSyntaxChecker.check(input);
     assertEquals(expected,actual);
    }

    @Test
    public void testNotRegexStringPatternShouldBeInValid()
    {
        String input ="{hello world";
        String expected="Invalid";
        String actual =PatternSyntaxChecker.check(input);
        assertEquals(expected,actual);
    }

}