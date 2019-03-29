package com.grosser.codesignal;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CheckPalindrome {

    boolean checkPalindrome(String inputString) {
        // stream the characters in the string to an array of characters
        // stream the characters in the string in reverse to an array of characters
        // check if the two streams are the same

        char[] forward = inputString.toCharArray();
        char[] backward = reverse(forward);

        return Arrays.equals(forward, backward);
    }

    private char[] reverse(char[] input){
        char[] reverse = new char[input.length];

        int fwdIndex = input.length - 1;
        int revIndex = 0;

        while(fwdIndex >= 0){
            reverse[revIndex] = input[fwdIndex];
            fwdIndex--;
            revIndex++;
        }

        return reverse;
    }
}
