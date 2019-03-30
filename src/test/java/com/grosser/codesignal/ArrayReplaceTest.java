package com.grosser.codesignal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertArrayEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ArrayReplaceTest {

    @Autowired
    ArrayReplace instance;

    @Test
    public void test001() {
        assertArrayEquals(new int[]{3, 2, 3}, instance.arrayReplace(new int[]{1, 2, 1}, 1, 3));
    }

    @Test
    public void test002() {
        assertArrayEquals(new int[]{1, 2, 0, 4, 5}, instance.arrayReplace(new int[]{1, 2, 3, 4, 5}, 3, 0));
    }

    @Test
    public void test003() {
        assertArrayEquals(new int[]{10, 10, 10}, instance.arrayReplace(new int[]{1, 1, 1}, 1, 10));
    }

    @Test
    public void test004() {
        assertArrayEquals(new int[]{1, 1, 1, 1, 1}, instance.arrayReplace(new int[]{1, 2, 1, 2, 1}, 2, 1));
    }

    @Test
    public void test005() {
        assertArrayEquals(new int[]{2, 2, 2, 2, 2}, instance.arrayReplace(new int[]{1, 2, 1, 2, 1}, 1, 2));
    }

    @Test
    public void test006() {
        assertArrayEquals(new int[]{9, 1}, instance.arrayReplace(new int[]{3, 1}, 3, 9));
    }

}