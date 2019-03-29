package com.grosser.codesignal;

import org.springframework.stereotype.Component;

@Component
public class CenturyFromYear {

    int centuryFromYear(int year) {
        return (year % 100) > 0 ? year / 100 + 1 : year / 100;
    }


}
