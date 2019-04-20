package com.grosser.codesignal.arcade.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CountSumOfTwoRepresentations2Test {

    @Autowired
    CountSumOfTwoRepresentations2 instance;

    @Test
    public void test(){
        assertEquals(2, instance.countSumOfTwoRepresentations2(6, 2, 4));
    }

}