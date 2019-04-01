package com.grosser.codesignal.arcade.intro;

import org.springframework.stereotype.Component;

/**
 * Check if all digits of the given integer are even.
 */
@Component
public class EvenDigitsOnly {

    boolean evenDigitsOnly(int n) {
        String str = Integer.toString(n);
        char[] chars = str.toCharArray();
        for(char c : chars){
            if(Integer.parseInt(String.valueOf(c)) % 2 != 0){
                return false;
            }
        }
        return true;
    }
}
