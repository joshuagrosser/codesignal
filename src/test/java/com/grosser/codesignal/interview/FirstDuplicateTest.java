package com.grosser.codesignal.interview;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class FirstDuplicateTest {

    @Autowired
    FirstDuplicate instance;

    @Test
    public void test001() {
        assertEquals(3, instance.firstDuplicateEfficient(new int[]{2, 1, 3, 5, 3, 2}));
    }

    @Test
    public void test002() {
        assertEquals(2, instance.firstDuplicateEfficient(new int[]{2, 2}));
    }

    @Test
    public void test003() {
        assertEquals(-1, instance.firstDuplicateEfficient(new int[]{2, 4, 3, 5, 1}));
    }

    @Test
    public void test004() {
        assertEquals(-1, instance.firstDuplicateEfficient(new int[]{1}));
    }

    @Test
    public void test005() {
        assertEquals(5, instance.firstDuplicateEfficient(new int[]{5, 5, 5, 5, 5}));
    }

    @Test
    public void test006() {
        assertEquals(-1, instance.firstDuplicateEfficient(new int[]{2, 1}));
    }

    @Test
    public void test007() {
        assertEquals(-1, instance.firstDuplicateEfficient(new int[]{2,1,3}));
    }

    @Test
    public void test008() {
        assertEquals(3, instance.firstDuplicateEfficient(new int[]{2,3,3}));
    }

    @Test
    public void test009() {
        assertEquals(3, instance.firstDuplicateEfficient(new int[]{3,3,3}));
    }

    @Test
    public void test010() {
        assertEquals(6, instance.firstDuplicateEfficient(new int[]{8, 4, 6, 2, 6, 4, 7, 9, 5, 8}));
    }
}