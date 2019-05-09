package com.grosser.codesignal.arcade.intro;

public class AbsoluteValueSumMin {

    int absoluteValuesSumMinimization(int[] a) {
        int min = -1;
        int result = -1;
        for(int i=0; i < a.length; i++){
            int agg = 0;
            for(int j = 0; j < a.length; j++){
                agg += Math.abs(a[i] - a[j]);
            }

            if(i == 0) {
                min = agg;
                result = a[i];
            } else if(agg < min) {
                min = agg;
                result = a[i];
            }
        }
        return result;
    }

}
