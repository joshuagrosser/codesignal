package com.grosser.codesignal.arcade.intro;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayMaxConsecutiveSumTest {

    @Test
    public void test001(){
        ArrayMaxConsecutiveSum instance = new ArrayMaxConsecutiveSum();
        int result = instance.arrayMaxConsecutiveSum(new int[]{0, 9, 3, 1, 4, 2}, 2);
        assertEquals(12, result);
    }

}