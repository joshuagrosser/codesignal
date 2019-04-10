package com.grosser.codesignal.arcade.core;

import org.springframework.stereotype.Component;

/**
 * Some phone usage rate may be described as follows:
 * <p>
 * first minute of a call costs min1 cents, each minute from the 2nd up to 10th (inclusive) costs min2_10 cents each
 * minute after 10th costs min11 cents. You have s cents on your account before the call. What is the duration of the
 * longest call (in minutes rounded down to the nearest integer) you can have?
 */
@Component
public class PhoneCall {
    int phoneCall(int min1, int min2_10, int min11, int s) {
        // Spend some money by iterating backwards from s, and transform that into minutes until the next minute cannot
        // be bought.
        int minutes = 0;
        int remaining = s;
        // Iterate subtract the cost of each minute on each iteration
        while(remaining > 0) {
            // determine the cost of the current minute
            int costOfMinute = minutes < 1 ? min1 : (minutes < 10 ? min2_10 : min11);
            if (remaining >= costOfMinute) {
                minutes++;
            }
            remaining -= costOfMinute;
        }
        return minutes;
    }

}
