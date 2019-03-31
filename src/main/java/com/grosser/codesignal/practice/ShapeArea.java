package com.grosser.codesignal.practice;

import org.springframework.stereotype.Component;

/**
 * Below we will define an n-interesting polygon. Your task is to find the area of a polygon for a given n.
 * <p>
 * A 1-interesting polygon is just a square with a side of length 1. An n-interesting polygon is obtained by taking
 * the n - 1-interesting polygon and appending 1-interesting polygons to its rim, side by side.
 */
@Component
public class ShapeArea {

    int shapeArea(int n) {
        return (int) Math.pow(n, 2) + (int) Math.pow(n - 1, 2);
    }

}
