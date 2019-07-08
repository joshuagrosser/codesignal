package com.grosser.codesignal.arcade.intro;

import org.springframework.stereotype.Component;

@Component
public class DigitDegree {

    int digitDegree(int n) {
        int depth = 1;
        int sum = 0;
        String[] array = String.valueOf(n).split("");
        for(String s : array){
            int val = Integer.parseInt(s);
            sum += val;
        }
        if(sum < 10){
            if (sum == n){
                return 0;
            } else {
                return depth;
            }
        } else {
            return 1 + digitDegree(sum);
        }
    }
}
