package com.example.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Example1 {
    public List<String> noteMedium(String word) {

        String regex = "7\\.[2-9]\\s+-\\s+[A-Z][a-zã]+";
        final var matcher = Pattern.compile(regex)
                                   .matcher(word);


        var listResult = new ArrayList<String>();
        while (matcher.find()) {
            final var group = matcher.group();
            listResult.add(group);
        }
        return listResult;
    }

    public boolean validateUserName(String word) {
        String regex = "[a-zA-Z][a-zA-Z\\d]{0,9}";
        final var matcher = Pattern.compile(regex).matcher(word);
        return matcher.matches();
    }

    public String helloWorld() {
        return "Hello world";
    }

    public String helloTest() {
        return "Hello world";
    }

}
