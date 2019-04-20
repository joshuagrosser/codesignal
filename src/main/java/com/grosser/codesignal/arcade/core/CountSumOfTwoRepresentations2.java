package com.grosser.codesignal.arcade.core;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CountSumOfTwoRepresentations2 {

    public int countSumOfTwoRepresentations2(int n, int l, int r) {
        // for each number between l and r, take the difference of n and the number.
        Map<Integer, Integer> results = new HashMap<>(n);
        for(int i = l; i <= r; i++){
            int diff = n - i;
            if(diff >= l && diff <= r){
                if(i >= diff && !results.containsKey(i)){
                    results.put(i, diff);
                }

                if (i < diff && !results.containsKey(diff)) {
                    results.put(diff, i);
                }
            }
            System.out.println(results);
        }
        return results.keySet().size();
    }

    // Less efficient Java Streams approach:

//    public int countSumOfTwoRepresentations2(int n, int l, int r){
//        // If that difference is in the array, then we found a match, so increment the result
//
//        final List<Integer> list = IntStream.rangeClosed(l, r).boxed().collect(Collectors.toList());
//        List<List<Integer>> pairs = new ArrayList<>();
//        return (int) list.stream().filter(i -> {
//            List<Integer> pair = new ArrayList<>();
//            pair.add(i);
//            pair.add(n - i);
//            Collections.sort(pair);
//            if (list.contains(n - i) && !pairs.contains(pair)) {
//                pairs.add(pair);
//                return true;
//            }
//            return false;
//        }).count();
//    }
}
