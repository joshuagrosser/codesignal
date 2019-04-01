package com.grosser.codesignal.arcade.intro;

import org.springframework.stereotype.Component;

/**
 * Given a year, return the century it is in. The first century spans from the year 1 up to and including the year 100,
 * the second - from the year 101 up to and including the year 200, etc.
 */
@Component
public class CenturyFromYear {

    int centuryFromYear(int year) {
        return (year % 100) > 0 ? year / 100 + 1 : year / 100;
    }


}
