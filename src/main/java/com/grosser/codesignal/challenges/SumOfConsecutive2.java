package com.grosser.codesignal.challenges;

import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
public class SumOfConsecutive2 {

    int isSumOfConsecutive2(int n) {
        List<Integer> list = IntStream.range(1, n).boxed().collect(Collectors.toList());
        int result = 0;
        for(int i=1; i < list.size(); i++){
            int runningSum = i;
            int iterator = i+1;
            while(runningSum <= n){
                runningSum = runningSum + iterator; // 3 + 3
                if(runningSum == n){
                    result++;
                    break;
                }
                iterator++;
            }
        }
        return result;
    }
}
