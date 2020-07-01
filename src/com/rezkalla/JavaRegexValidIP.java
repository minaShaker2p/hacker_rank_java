package com.rezkalla;

public class JavaRegexValidIP {
    /**
     * IP address is a string in the form "A.B.C.D", where the value of A, B, C,
     * and D may range from 0 to 255. Leading zeros are allowed.
     * The length of A, B, C, or D can't be greater than 3.
     */
    public static boolean isValidIP(String ip) {
        String ipRegex= "^(([0-1]?[0-9]?[0-9]?|2[0-4][0-9]|25[0-5])\\.){3}([0-1]?[0-9]?[0-9]?|2[0-4][0-9]|25[0-5]){1}$";
        return ip.matches(ipRegex);
    }

}
