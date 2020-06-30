package com.rezkalla;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidUsernameRegexTest {

    @Test
    public void testUsernameIsValid()
    {
        String input1="JuliaZ007";
        String input2="Samantha";
        String input3="Samantha_21";
        String expected="Valid";
       assertEquals(expected,ValidUsernameRegex.isValidUsername(input1));
        assertEquals(expected,ValidUsernameRegex.isValidUsername(input2));
        assertEquals(expected,ValidUsernameRegex.isValidUsername(input3));
    }

    @Test
    public void testUsernameIsInvalid()
    {
        String input1="Julia";
        String input2="1Samantha";
        String input3="Julia@007";
        String expected="Invalid";
        assertEquals(expected,ValidUsernameRegex.isValidUsername(input1));
       assertEquals(expected,ValidUsernameRegex.isValidUsername(input2));
        assertEquals(expected,ValidUsernameRegex.isValidUsername(input3));
    }

}