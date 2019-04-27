package com.grosser.codesignal.challenges;

import java.util.*;

class ConstructSquare {
    int constructSquare(String s) {
        // Since the length of the input string is >= 1 and < 10, all the letters can be mapped to digits
        // Calculate the set of squares with the same number of digits as no. of chars in the input string
        List<Integer> squares = new ArrayList<>();
        int numDigits = s.length();
        for(int i = 1; i < 100000; i++){
            int val = (int)Math.pow(i, 2);
            int powerLength = String.valueOf(val).length();
            if(powerLength == s.length()){
                squares.add(val);
            } else if (powerLength > s.length()){
                break;
            }
        }

        // Store the frequencies of each character
        List<Integer> sFreq = freq(s);

        // Work backward through the sorted list of squares to find a frequency match
        for(int i = squares.size() - 1; i >= 0; i--){
            int val = squares.get(i);
            if(freq(String.valueOf(val)).equals(sFreq)){
                return val;
            }
        }
        return -1;
    }

    List<Integer> freq(String s){
        String[] split = s.split("");
        List<String> strList = new ArrayList<>();
        Set<String> strSet = new HashSet<>();
        for(String spl : split){
            strList.add(spl);
            strSet.add(spl);
        }
        List<Integer> charFreq = new ArrayList<>();
        Iterator<String> it = strSet.iterator();
        while(it.hasNext()){
            String next = it.next();
            charFreq.add(Collections.frequency(strList, next));
        }
        Collections.sort(charFreq);
        return charFreq;
    }
}