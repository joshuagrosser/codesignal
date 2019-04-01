package com.grosser.codesignal.arcade.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class LargestNumberTest {

    @Autowired
    LargestNumber instance;

    @Test
    public void test001(){
        assertEquals(9, instance.largestNumber(1));
    }

    @Test
    public void test002(){
        assertEquals(999999999, instance.largestNumber(9));
    }

    @Test
    public void test003(){
        assertEquals(99999, instance.largestNumber(5));
    }

}