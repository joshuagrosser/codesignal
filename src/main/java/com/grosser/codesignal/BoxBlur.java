package com.grosser.codesignal;

import org.springframework.stereotype.Component;

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

    int average(int[][] image, int x, int y){
        int avg = 0;
        for(int i = x-1; i < x + 2; i++){
            for(int j = y-1; j < y + 2; j++){
                avg += image[i][j];
            }
        }
        return avg / 9;
    }
}
