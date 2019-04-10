package com.grosser.codesignal.arcade.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class LateRideTest {

    @Autowired
    LateRide instance;

    @Test
    public void test001() {
        assertEquals(4, instance.lateRide(240));
    }

    @Test
    public void test002() {
        assertEquals(14, instance.lateRide(808));
    }

    @Test
    public void test003() {
        assertEquals(19, instance.lateRide(1439));
    }

    @Test
    public void test004() {
        assertEquals(0, instance.lateRide(0));
    }

}