package com.grosser.codesignal.arcade.intro;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DigitDegreeTest {

    @Autowired
    DigitDegree instance;

    @Test
    public void test9Returns0(){
        assertEquals(0, instance.digitDegree(9));
    }

    @Test
    public void test100Returns1(){
        assertEquals(1, instance.digitDegree(100));
    }

    @Test
    public void test99Returns2(){
        assertEquals(2, instance.digitDegree(99));
    }

    @Test
    public void test304Returns1(){
        assertEquals(1, instance.digitDegree(304));
    }

    @Test
    public void test1000000Returns1(){
        assertEquals(1, instance.digitDegree(10000000));
    }
}