package com.grosser.codesignal;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Write a short program that prints each number from 1 to 100 in a comma-separated array.
 *
 * For each multiple of 3, print "Fizz" instead of the number.
 *
 * For each multiple of 5, print "Buzz" instead of the number.
 *
 * For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number.
 */
@Component
public class FizzBuzz {

    String fizzBuzz() {
        List<String> fizzBuzz = new ArrayList<>();
        IntStream.range(1, 101).forEach(i -> {
                    String result;
                    if (i % 15 == 0) {
                        result = "FizzBuzz";
                    } else if (i % 3 == 0) {
                        result = "Fizz";
                    } else if (i % 5 == 0) {
                        result = "Buzz";
                    } else {
                        result = String.valueOf(i);
                    }
                    fizzBuzz.add(result);
                }
        );
        return Arrays.toString(fizzBuzz.toArray());
    }
}
