package com.grosser.codesignal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertArrayEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BoxBlurTest {

    @Autowired
    BoxBlur instance;

    @Test
    public void test001() {
        int[][] image = {
                {1, 1, 1},
                {1, 7, 1},
                {1, 1, 1}
        };

        int[][] result = {
                {1}
        };

        assertArrayEquals(result, instance.boxBlur(image));
    }

    @Test
    public void test002() {
        int[][] image = {
                {0, 18, 9},
                {27, 9, 0},
                {81, 63, 45}
        };

        int[][] result = {
                {28}
        };

        assertArrayEquals(result, instance.boxBlur(image));
    }

    @Test
    public void test003() {
        int[][] image = {
                {36, 0, 18, 9},
                {27, 54, 9, 0},
                {81, 63, 72, 45}
        };

        int[][] result = {
                {40, 30}
        };

        assertArrayEquals(result, instance.boxBlur(image));
    }

    @Test
    public void test004() {
        int[][] image = {
                {7, 4, 0, 1},
                {5, 6, 2, 2},
                {6, 10, 7, 8},
                {1, 4, 2, 0}
        };

        int[][] result = {
                {5, 4},
                {4, 4}
        };

        assertArrayEquals(result, instance.boxBlur(image));
    }

}