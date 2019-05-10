package com.grosser.codesignal.arcade.intro;

import java.util.Arrays;
import java.util.OptionalInt;

public class ArrayMaxConsecutiveSum {

    int arrayMaxConsecutiveSum(int[] inputArray, int k) {
        int result = 0;
        for(int i = 0; i < inputArray.length; i++) {
            int currentSum = Arrays.stream(inputArray).skip(i).limit(k).reduce(Integer::sum).getAsInt();
            if(currentSum > result){
                result = currentSum;
            }
        }
        return result;
    }

}
