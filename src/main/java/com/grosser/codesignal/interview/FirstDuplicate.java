package com.grosser.codesignal.interview;

import org.springframework.stereotype.Component;

/**
 * Given an array a that contains only numbers in the range from 1 to a.length, find the first duplicate number for
 * which the second occurrence has the minimal index. In other words, if there are more than 1 duplicated numbers,
 * return the number for which the second occurrence has a smaller index than the second occurrence of the other
 * number does. If there are no such elements, return -1.
 * <p></p>
 * Guaranteed constraints:
 * 1 ≤ a.length ≤ 10^5,
 * 1 ≤ a[i] ≤ a.length.
 * <p>
 * Example
 * <p>
 * For a = [2, 1, 3, 5, 3, 2], the output should be firstDuplicateEfficient(a) = 3.
 * <p>
 * There are 2 duplicates: numbers 2 and 3. The second occurrence of 3 has a smaller index than the second occurrence
 * of 2 does, so the answer is 3.
 * <p>
 * For a = [2, 2], the output should be firstDuplicateEfficient(a) = 2;
 * <p>
 * For a = [2, 4, 3, 5, 1], the output should be firstDuplicateEfficient(a) = -1.
 */
@Component
public class FirstDuplicate {

    /**
     * This is a brute force solution and runs at O(n^2) time for finding duplicates because when iterating through
     * the original array, each value must be compared against all previously traversed values. This approach does
     * NOT track previously scanned values - it must iterate through the previous values in the array again to do
     * comparisons.
     */
    int firstDuplicateOriginal(int[] a) {

        // For each element in the array
        // if element equals any of the previous elements in the array, it is a duplicate
        // Record the value of the first duplicate encountered
        // if reached the end of the list and no duplicates are encountered, return -1
        // else, return the value of the first duplicate encountered
        int result = -1;
        int numComparisons = 0;

        // Circuit break
        if (a.length <= 1) {
            System.out.println(numComparisons);
            return -1;
        }

        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    result = a[i];
                    break; // first duplicate found
                }
                numComparisons++;
            }
            if (result != -1) {
                break;
            }
        }
        System.out.println(numComparisons);
        return result;
    }

    /**
     * This solution is more efficient and runs at O(n) time for finding duplicates because there is only a single
     * loop through the array. Previous values that have already been scanned are TRACKED by setting the value as a
     * negative version of the same value. Comparisons are done using the absolute value.
     *
     * Instead of iterating through the list in order from a[0] to a[a.length-1], this algorithm iterates through the
     * list by using the actual value at a[i] since 1 ≤ a[i] ≤ a.length.
     */
    int firstDuplicateEfficient(int[] a) {

        int numComparisons = 0;
        for (int i = 0; i < a.length; i++) {
            numComparisons++;
            if (a[Math.abs(a[i]) - 1] < 0) {
                // Found the first duplicate
                System.out.println(numComparisons);
                return Math.abs(a[i]);
            }
            else {
                // Set a[val-1] as negative of the same value, so if a[0] == 2, then a[0] = -2
                // Its technically the same number, just the inverse, so you can still do a comparison
                // by using the absolute value. Because the number is negative you know you've already
                // checked that number...
                //
                // IMPORTANT: This saves compute time because you only have to traverse the array ONCE (one 'for' loop)
                a[Math.abs(a[i]) - 1] = -a[Math.abs(a[i]) - 1];
            }
        }
        System.out.println(numComparisons);
        return -1;
    }

}
