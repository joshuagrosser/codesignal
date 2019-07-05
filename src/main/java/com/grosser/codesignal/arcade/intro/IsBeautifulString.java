package com.grosser.codesignal.arcade.intro;

import java.util.Map;
import java.util.TreeMap;

public class IsBeautifulString {

    boolean isBeautifulString(String inputString) {
        // create a HashMap to count the number of times each character occurs
        Map<Character, Integer> instanceCount = new TreeMap<Character, Integer>();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for(char c : alphabet) {
            instanceCount.put(c, 0);
        }

        // Count the number of instances of each char in the inputString
        char[] arr = inputString.toCharArray();
        for(char c : arr){
            int val = instanceCount.get(c);
            instanceCount.put(c, ++val);
        }

        // iterate through the keys of the hash in order, and if any of the values is greater
        // than a previous value, return false
        int prevVal = -1;
        int index = 0;
        for(int val : instanceCount.values()) {
            if(index > 0){
                if(prevVal < val) {
                    return false;
                }
            }
            prevVal = val;
            index++;
        }

        // If reached the end of the map, return true
        return true;
    }
}
