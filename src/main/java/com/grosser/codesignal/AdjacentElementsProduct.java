package com.grosser.codesignal;

import org.springframework.stereotype.Component;


/**
 * Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.
 */
@Component
public class AdjacentElementsProduct {

    int adjacentElementsProduct(int[] input) {
        int winner = -1;
        int prevVal = -1;
        for(int i=0; i < input.length; i++){
            if(i == 0){
                winner = input[i];
                prevVal = input[i];
            } else {
                int result = input[i] * prevVal;
                if(i == 1) {
                    winner = result;
                } else if(result > winner) {
                    winner = result;
                }
                prevVal = input[i];
            }
        }
        return winner;
    }

}
