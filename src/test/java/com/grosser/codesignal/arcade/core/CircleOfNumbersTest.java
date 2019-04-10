package com.grosser.codesignal.arcade.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


@SpringBootTest
@RunWith(SpringRunner.class)
public class CircleOfNumbersTest {

    @Autowired
    CircleOfNumbers instance;

    @Test
    public void test001(){
        assertEquals(7, instance.circleOfNumbers(10, 2));
    }

    @Test
    public void test002(){
        assertEquals(2, instance.circleOfNumbers(10, 7));
    }

    @Test
    public void test003(){
        assertEquals(3, instance.circleOfNumbers(4, 1));
    }

    @Test
    public void test004(){
        assertEquals(0, instance.circleOfNumbers(6, 3));
    }

    @Test
    public void test005(){
        assertEquals(15, instance.circleOfNumbers(18, 6));
    }

    @Test
    public void test006(){
        assertEquals(10, instance.circleOfNumbers(20, 0));
    }

    @Test
    public void test007(){
        assertEquals(9, instance.circleOfNumbers(20, 19));
    }

}