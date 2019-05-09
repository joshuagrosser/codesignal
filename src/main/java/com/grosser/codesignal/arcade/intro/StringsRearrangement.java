package com.grosser.codesignal.arcade.intro;

import java.util.Arrays;

public class StringsRearrangement {

    // Since the input is limited to 10 items, the total possible permutations are 10!, or 3MM.
    // Brute force would be to check every single permutation by iterating through the array
    // for each permutation and determining if item i+1 was one character different than item i.
    // Each item in the array can be at most 15 characters, so for each item, we need to track another
    // loop through the characters in the item to check each character and see if it is the same.
    // If there is more than one character that is not the same, break.
    boolean stringsRearrangement(String[] inputArray) {
        return permute(inputArray, 0, inputArray.length - 1);
    }

    boolean permute(String[] inputArray, int e1, int e2) {
        if (e1 == e2) {
            return allItemsDiffByOne(inputArray);
        } else {
            for (int i = e1; i <= e2; i++) {
                inputArray = swapElements(inputArray, e1, i);
                if (permute(inputArray, e1 + 1, e2)) {
                    return true;
                }
                inputArray = swapElements(inputArray, e1, i);
            }
        }
        return false;
    }

    String[] swapElements(String[] inputArray, int e1, int e2) {
        String temp = inputArray[e1];
        inputArray[e1] = inputArray[e2];
        inputArray[e2] = temp;
        return inputArray;
    }

    boolean allItemsDiffByOne(String[] inputArray) {
        for (int i = 0; i < inputArray.length - 1; i++) {
            char[] c1 = inputArray[i].toCharArray();
            char[] c2 = inputArray[i + 1].toCharArray();
            if (!diffByExactlyOne(c1, c2)) {
                return false;
            }
        }
        return true;
    }

    // How to determine if two strings differ by EXACTLY one character???
    // Iterate through each character in array A and determine if the character equals the character
    // at the same position in array B.
    // If all characters are the same, and reach the end of the array, then allCharsDiffByOne = false;
    // If a character is the same, continue
    // If a character is different, and there wasn't already a different character, record that one char was different and continue
    // If a character is different, and there WAS already a different character, allCharsDiffByOne = false;
    boolean diffByExactlyOne(char[] c1, char[] c2) {
        boolean allCharsDiffByOne = false;
        for (int j = 0; j < c1.length; j++) {
            if (c1[j] != c2[j]) {
                if (!allCharsDiffByOne) {
                    allCharsDiffByOne = true;
                } else {
                    allCharsDiffByOne = false;
                    break;
                }
            }
        }
        return allCharsDiffByOne;
    }


}
