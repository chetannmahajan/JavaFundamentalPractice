package org.example.stringJoinerClass;

import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
//        Input = Hello how are you;
//        Output = [Hello-how-are-you];

        String input = "Hello how are you";
        String[] inputArray = input.split(" ");

        StringJoiner joiner = new StringJoiner("-","[","]");
        for (String string: inputArray ){
            joiner.add(string);
        }

        System.out.println(joiner.toString());
    }
}
