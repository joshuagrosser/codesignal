package com.grosser.codesignal.arcade.intro;

import org.springframework.stereotype.Component;

/**
 * Write a function that reverses characters in (possibly nested) parentheses in the input string.
 * <p>
 * Input strings will always be well-formed with matching ()s.
 * <p>
 * Example
 * <p>
 * For inputString = "(bar)", the output should be
 * reverseInParentheses(inputString) = "rab";
 * For inputString = "foo(bar)baz", the output should be
 * reverseInParentheses(inputString) = "foorabbaz";
 * For inputString = "foo(bar)baz(blim)", the output should be
 * reverseInParentheses(inputString) = "foorabbazmilb";
 * For inputString = "foo(bar(baz))blim", the output should be
 * reverseInParentheses(inputString) = "foobazrabblim".
 * Because "foo(bar(baz))blim" becomes "foo(barzab)blim" and then "foobazrabblim".
 */
@Component
public class ReverseInParenthesis {

    String reverseInParentheses(String inputString) {
        String result = inputString;
        while(result.contains("(")) {
            int innerStart = result.lastIndexOf("(");
            int innerEnd = result.indexOf(")", innerStart);
            String inner = result.substring(innerStart+1, innerEnd);
            String reversed = reverse(inner);
            result = result.replace("(" + inner + ")", reversed);
        }
        return result;
    }

    private String reverse(String inputString){
        char[] chars = inputString.toCharArray();
        char[] reversed = new char[chars.length];
        int counter = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed[counter] = chars[i];
            counter++;
        }
        return String.valueOf(reversed);
    }


}
