package com.grosser.codesignal.arcade.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PhoneCallTest {

    @Autowired
    PhoneCall instance;

    @Test
    public void test() {
        assertEquals(14, instance.phoneCall(3, 1, 2, 20));
    }

    @Test
    public void test002() {
        assertEquals(1, instance.phoneCall(2, 2, 1, 2));
    }

    @Test
    public void test003() {
        assertEquals(11, instance.phoneCall(10, 1, 2, 22));
    }

    @Test
    public void test004() {
        assertEquals(14, instance.phoneCall(2, 2, 1, 24));
    }

    @Test
    public void test005() {
        assertEquals(3, instance.phoneCall(1, 2, 1, 6));
    }

    @Test
    public void test006() {
        assertEquals(0, instance.phoneCall(10, 10, 10, 8));
    }

}