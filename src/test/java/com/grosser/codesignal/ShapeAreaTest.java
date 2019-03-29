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
    ShapeArea shapeArea;

    @Test
    public void testShapeArea001() {
        assertEquals(5, shapeArea.shapeArea(2));
    }

    @Test
    public void testShapeArea002() {
        assertEquals(13, shapeArea.shapeArea(3));
    }

    @Test
    public void testShapeArea003() {
        assertEquals(1, shapeArea.shapeArea(1));
    }

    @Test
    public void testShapeArea004() {
        assertEquals(41, shapeArea.shapeArea(5));
    }

    @Test
    public void testShapeArea005() {
        assertEquals(97986001, shapeArea.shapeArea(7000));
    }

    @Test
    public void testShapeArea006() {
        assertEquals(127984001, shapeArea.shapeArea(8000));
    }

    @Test
    public void testShapeArea007() {
        assertEquals(199940005, shapeArea.shapeArea(9999));
    }

    @Test
    public void testShapeArea008() {
        assertEquals(199900013, shapeArea.shapeArea(9998));
    }

    @Test
    public void testShapeArea009() {
        assertEquals(161946005, shapeArea.shapeArea(8999));
    }

    @Test
    public void testShapeArea010() {
        assertEquals(19801, shapeArea.shapeArea(100));
    }

}