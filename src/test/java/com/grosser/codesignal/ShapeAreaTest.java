package com.grosser.codesignal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ShapeAreaTest {

    @Autowired
    ShapeArea instance;

    @Test
    public void testShapeArea001() {
        assertEquals(5, instance.shapeArea(2));
    }

    @Test
    public void testShapeArea002() {
        assertEquals(13, instance.shapeArea(3));
    }

    @Test
    public void testShapeArea003() {
        assertEquals(1, instance.shapeArea(1));
    }

    @Test
    public void testShapeArea004() {
        assertEquals(41, instance.shapeArea(5));
    }

    @Test
    public void testShapeArea005() {
        assertEquals(97986001, instance.shapeArea(7000));
    }

    @Test
    public void testShapeArea006() {
        assertEquals(127984001, instance.shapeArea(8000));
    }

    @Test
    public void testShapeArea007() {
        assertEquals(199940005, instance.shapeArea(9999));
    }

    @Test
    public void testShapeArea008() {
        assertEquals(199900013, instance.shapeArea(9998));
    }

    @Test
    public void testShapeArea009() {
        assertEquals(161946005, instance.shapeArea(8999));
    }

    @Test
    public void testShapeArea010() {
        assertEquals(19801, instance.shapeArea(100));
    }

}