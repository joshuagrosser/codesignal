package com.grosser.codesignal.playground;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class AggregatePools {

    public static int[][] aggregatePools(int[] pools) {
        Integer[] boxedInts = IntStream.of(pools).boxed().toArray(Integer[]::new);
        Arrays.sort(boxedInts, Collections.reverseOrder());
        System.out.println(Arrays.toString(boxedInts));

        List<List<Integer>> results = new ArrayList<>();
        for (int i = 0; i < pools.length; i++) {
            if (pools[i] > 1000) {
                results.add(new ArrayList<>(pools[i]));
                continue;
            } else {
                List<Integer> stuff = new ArrayList<>();
                int runningTotal = 0;
                int counter = i + 1;
                while(runningTotal <= 1000){
                    stuff.add(pools[counter]);
                    runningTotal += pools[counter];
                    counter++;
                }
                if(runningTotal == 1000){

                }
            }
        }

        // TODO Aggregate results
        return new int[][]{{}};
    }
}
