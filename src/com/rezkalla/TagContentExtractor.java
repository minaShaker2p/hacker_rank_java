package com.rezkalla;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

    public static String getContent(String line) {
        boolean isMatch = false;
        StringBuilder builder = new StringBuilder();
        Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
            builder.append(matcher.group(2));
            builder.append("\n");
            isMatch = true;
        }
        if (!isMatch)
            return "None";
        return builder.toString();

    }
}
