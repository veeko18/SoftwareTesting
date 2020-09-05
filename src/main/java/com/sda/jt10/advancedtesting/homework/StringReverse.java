package com.sda.jt10.advancedtesting.homework;

import java.util.ArrayList;
import java.util.List;

public class StringReverse {

    public static String reverse(String s) {
        //create list of tempArray
        //length() returns number of chars in a string
        List<String> tempArray = new ArrayList<String>(s.length());
        for (int i = 0; i < s.length(); i++) {
            //substring() returns new string at the specified beginIndex
            //and end at lastIndex - 1
            tempArray.add(s.substring(i, i + 1));
        }

        //creates a modifiable string
        StringBuilder reversedString = new StringBuilder(s.length());
        for (int i = tempArray.size() - 1; i >= 0; i--) {
            reversedString.append(tempArray.get(i));
        }
        return reversedString.toString();
    }
}
