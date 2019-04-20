package com.grosser.codesignal.arcade.core;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
public class CountSumOfTwoRepresentations2 {

    public int countSumOfTwoRepresentations2(int n, int l, int r) {
        // Create an array of numbers between l and r
        // for each number in that array, take the difference of n and the number.
        // If that difference is in the array, then we found a match, so increment the result

        final List<Integer> list = IntStream.rangeClosed(l, r).boxed().collect(Collectors.toList());
        List<List<Integer>> pairs = new ArrayList<>();
        return (int) list.stream().filter(i -> {
            List<Integer> pair = new ArrayList<>();
            pair.add(i);
            pair.add(n - i);
            Collections.sort(pair);
            System.out.println(pair);
            if (list.contains(n - i) && !pairs.contains(pair)) {
                pairs.add(pair);
                return true;
            }
            return false;
        }).count();
    }
}
