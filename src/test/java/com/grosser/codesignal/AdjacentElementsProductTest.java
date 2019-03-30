package com.grosser.codesignal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AdjacentElementsProductTest {

    @Autowired
    AdjacentElementsProduct instance;

    @Test
    public void testAdjacentElementsProduct001() {
        int[] input = {3, 6, -2, -5, 7, 3};
        assertEquals(21, instance.adjacentElementsProduct(input));
    }

    @Test
    public void testAdjacentElementsProduct002() {
        int[] input = {-1, -2};
        assertEquals(2, instance.adjacentElementsProduct(input));
    }

    @Test
    public void testAdjacentElementsProduct003() {
        int[] input = {1, 2, 3, 0};
        assertEquals(6, instance.adjacentElementsProduct(input));
    }

    @Test
    public void testAdjacentElementsProduct004() {
        int[] input = {9, 5, 10, 2, 24, -1, -48};
        assertEquals(50, instance.adjacentElementsProduct(input));
    }

    @Test
    public void testAdjacentElementsProduct005() {
        int[] input = {5, 6, -4, 2, 3, 2, -23};
        assertEquals(30, instance.adjacentElementsProduct(input));
    }

    @Test
    public void testAdjacentElementsProduct006() {
        int[] input = {4, 1, 2, 3, 1, 5};
        assertEquals(6, instance.adjacentElementsProduct(input));
    }

    @Test
    public void testAdjacentElementsProduct007() {
        int[] input = {-23, 4, -3, 8, -12};
        assertEquals(-12, instance.adjacentElementsProduct(input));
    }

    @Test
    public void testAdjacentElementsProduct008() {
        int[] input = {1, 0, 1, 0, 1000};
        assertEquals(0, instance.adjacentElementsProduct(input));
    }

}