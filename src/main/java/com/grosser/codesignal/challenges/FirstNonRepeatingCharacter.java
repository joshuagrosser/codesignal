package com.grosser.codesignal.challenges;

import java.util.*;

class FirstNonRepeatingCharacter {
    char firstNotRepeatingCharacter(String s) {
        // Need to iterate through the string and track the number of times that a specific character has repeated, or at the very least, if the character has repeated once.

        // need to track:
        // 1) if a letter has been seen yet
        // 2) what the first index of that letter is in the original string

//		char[] alphabet = new char[]{"a", "b", "c", "d", "e", "f", "g", "h", "i",
//		"j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        Map<Character, Integer> numberOfRepeats = new HashMap<>();
        Map<Character, Integer> firstIndex = new HashMap<>();

        char[] chars = s.toCharArray();
        for(int i=0; i < chars.length; i++){
            Integer val = numberOfRepeats.get(chars[i]);
            if(val == null){
                // if the letter is not in numberOfRepeats, add it with val 1
                numberOfRepeats.put(chars[i], 1);
                // and add the letter to the firstIndex map with the index
                firstIndex.put(chars[i], i);
            } else {
                // else if the letter already exists, increment numberOfRepeats but do not updated firstIndex
                numberOfRepeats.put(chars[i], val+1);
            }
        }

        int lowestIndex = -1;
        // TODO iterate through numberOfRepeats and find all the values that are 1
        for(Map.Entry<Character, Integer> entry : numberOfRepeats.entrySet()){
            if(entry.getValue() == 1){

                // TODO for each value that is 1, loopkup the lowest index from the map
                int index = firstIndex.get(entry.getKey());
                if(lowestIndex == -1 || index < lowestIndex){
                    lowestIndex = index;
                }
            }
        }
        // return the char with the lowest index
        return lowestIndex != -1 ? chars[lowestIndex] : '_';
    }

}