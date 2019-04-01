package com.grosser.codesignal.arcade.core;

import org.springframework.stereotype.Component;

/**
 * Given an integer n, return the largest number that contains exactly n digits.
 */
@Component
public class LargestNumber {

    int largestNumber(int n) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < n; i++){
            result.append("9");
        }
        return Integer.parseInt(result.toString());
    }

}
