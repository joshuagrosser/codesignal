package com.grosser.codesignal;

import org.springframework.stereotype.Component;

@Component
public class ArrayReplace {

    int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
        int[] result = new int[inputArray.length];
        for(int i = 0; i < inputArray.length; i++){
            if(elemToReplace == inputArray[i]){
                result[i] = substitutionElem;
            } else {
                result[i] = inputArray[i];
            }
        }
        return result;
    }
}
