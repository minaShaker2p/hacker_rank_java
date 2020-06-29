package com.rezkalla;

public class JavaStringTokens {

    public static String getNumberOfTokens(String s) {
        String[] tokens = s.split("[? ._!,'@]+");
        StringBuilder builder = new StringBuilder();
        System.out.println(tokens.length);
        builder.append(tokens.length);
        for (String str : tokens) {
            System.out.println(str);
            builder.append("\n").append(str);
        }
        return builder.toString();
    }
}
