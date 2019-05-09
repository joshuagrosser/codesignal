package com.grosser.codesignal.playground;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class AggregatePoolsTest {

    @Test
    public void test(){
        int[] pools = new int[]{ 12000, 300, 500, 600, 700 };
        int[][] result = AggregatePools.aggregatePools(pools);
        for(int i = 0; i < result.length; i++){
            System.out.println(Arrays.toString(result[i]));
        }

    }

}