package org.example.HasMap;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class HashMap {

    public static void main(String[] args) {

        java.util.HashMap<Character, Integer> charCountMap = new java.util.HashMap<>();
        //HashMap only accepts java classes they can't accept the primitive types.
        //HashMap can accepts only full java wrapper clases.

        String name = "cchetan";
        char[] strArray = name.toCharArray();

        for(char c: strArray){
            if(charCountMap.containsKey(c)){
                charCountMap.put(c, charCountMap.get(c) + 1);
            }else
            {
                charCountMap.put(c,1);
            }
        }
        //Print the charCounter
        charCountMap.forEach((Character, Integer) ->{
            if(Character == 'c') {
                System.out.println(charCountMap.get('c'));
            }
        });

        //Print the values by entrySet();

        //using strams
        name.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(c -> c.toString(), Collectors.counting())).forEach((k,v) -> System.out.println(k+" "+v));
    }
}
