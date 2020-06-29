package com.rezkalla;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

    public static String check(String reg) {
        String result;
        try {
             Pattern.compile(reg);
            result = "Valid";

        } catch (PatternSyntaxException ex) {
            result = "Invalid";
        }
        System.out.println(result);
        return result;
    }
}
