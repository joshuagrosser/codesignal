package com.grosser.codesignal.challenges;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SummaryProficiency {

    int summaryProficiency(int[] a, int n, int m) {
        return Arrays.stream(a).filter(item -> item >= m).limit(n).sum();
    }

}
