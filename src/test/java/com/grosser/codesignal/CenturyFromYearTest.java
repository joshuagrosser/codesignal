package com.grosser.codesignal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CenturyFromYearTest {

    @Autowired
    CenturyFromYear instance;

    @Test
    public void centuryFromYear() {
        assertTrue(true);
        instance = new CenturyFromYear();

        int centuryFromYear = instance.centuryFromYear(1);
        assertEquals(1, centuryFromYear);

    }
}