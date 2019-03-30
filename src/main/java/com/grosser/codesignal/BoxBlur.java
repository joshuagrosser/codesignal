package com.grosser.codesignal;

import org.springframework.stereotype.Component;

/**
 * Last night you partied a little too hard. Now there's a black and white photo of you that's about to go viral! You
 * can't let this ruin your reputation, so you want to apply the box blur algorithm to the photo to hide its content.
 *
 * The pixels in the input image are represented as integers. The algorithm distorts the input image in the following
 * way: Every pixel x in the output image has a value equal to the average value of the pixel values from the 3 × 3
 * square that has its center at x, including x itself. All the pixels on the border of x are then removed.
 *
 * Return the blurred image as an integer, with the fractions rounded down.
 */
@Component
public class BoxBlur {

    int[][] boxBlur(int[][] image) {
        int[][] result = new int[image.length-2][image[0].length-2];
        // Loop through the pixels in the middle, buffered by 1 pixel on each outside edge
        for(int x = 1; x < image.length - 1; x++){
            for(int y = 1; y < image[0].length - 1; y++){
                result[x-1][y-1] = average(image, x, y);
            }
        }
        return result;
    }

    private int average(int[][] image, int x, int y){
        int avg = 0;
        for(int i = x-1; i < x + 2; i++){
            for(int j = y-1; j < y + 2; j++){
                avg += image[i][j];
            }
        }
        return avg / 9;
    }
}
