package com.grosser.codesignal.arcade.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SeatsInTheaterTest {

    @Autowired
    SeatsInTheater instance;

    @Test
    public void test001(){
        assertEquals(0, instance.seatsInTheater(1, 1, 1, 1));
    }

    @Test
    public void test002(){
        assertEquals(96, instance.seatsInTheater(16, 11, 5, 3));
    }

    @Test
    public void test003(){
        assertEquals(18, instance.seatsInTheater(13, 6, 8, 3));
    }


}