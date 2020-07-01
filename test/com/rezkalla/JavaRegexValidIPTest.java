package com.rezkalla;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaRegexValidIPTest {

    @Test
    public void testIPisValid() {
        String ip1="000.12.12.034";
        String ip2="121.234.12.12";
        String ip3="23.45.12.56";
        assertTrue(JavaRegexValidIP.isValidIP(ip1));
        assertTrue(JavaRegexValidIP.isValidIP(ip2));
        assertTrue(JavaRegexValidIP.isValidIP(ip3));
    }

    @Test
    public void testIPisNotValid() {
        String ip1="000.12.234.23.23";
        String ip2="666.666.23.23";
        assertFalse(JavaRegexValidIP.isValidIP(ip1));
        assertFalse(JavaRegexValidIP.isValidIP(ip2));
    }

}