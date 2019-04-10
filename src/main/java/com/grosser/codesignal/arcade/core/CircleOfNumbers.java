package com.grosser.codesignal.arcade.core;

import org.springframework.stereotype.Component;

/**
 * Consider integer numbers from 0 to n - 1 written down along the circle in such a way that the distance between any
 * two neighboring numbers is equal (note that 0 and n - 1 are neighboring, too).
 * <p>
 * Given n and firstNumber, find the number which is written in the radially opposite position to firstNumber.
 */
@Component
public class CircleOfNumbers {

    /**
     * Approach: The trick with this problem is that the number of points will always be EVEN since the integers go from
     * 0 to n-1 and n is always even. This means that splitting the circle down the middle means that the offset will
     * always be the same from the opposite end.
     */
    int circleOfNumbers(int n, int firstNumber) {
        return firstNumber < n / 2 ? n / 2 + firstNumber : Math.abs(n / 2 - firstNumber);
    }
}
