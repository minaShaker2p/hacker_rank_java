package com.rezkalla;

/**
 * The username consists of  to  characters inclusive. If the username consists of less than  or greater than  characters, then it is an invalid username.
 * The username can only contain alphanumeric characters and underscores (_). Alphanumeric characters describe the character set consisting of lowercase characters , uppercase characters , and digits .
 * The first character of the username must be an alphabetic character, i.e., either lowercase character  or uppercase character .
 */
public class ValidUsernameRegex {

    public static String isValidUsername(String username) {
        String pattern = "[a-zA-Z]{1}[a-zA-Z0-9_]{7,29}";
        boolean isMatch = username.matches(pattern);
        if (isMatch)
            return "Valid";
        else
            return "Invalid";
    }
}
