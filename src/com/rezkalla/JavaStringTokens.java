package com.rezkalla;

public class JavaStringTokens {

    public static String getNumberOfTokens(String s) {
        if (s.trim().isEmpty()) {
            return "0";
        }
        String[] tokens = s.trim().split("[? ._!,'@]+");
        StringBuilder builder = new StringBuilder();
        builder.append(tokens.length);
        for (String str : tokens) {
            builder.append("\n").append(str);
        }
        return builder.toString();
    }
}
