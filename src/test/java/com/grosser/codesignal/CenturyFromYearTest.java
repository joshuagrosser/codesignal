package com.grosser.codesignal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CenturyFromYearTest {

    @Autowired
    CenturyFromYear centuryFromYear;

    @Test
    public void testNotNull() {
        assertNotNull(centuryFromYear);
    }

    @Test
    public void test1905() {
        assertEquals(20, this.centuryFromYear.centuryFromYear(1905));
    }

    @Test
    public void test1700() {
        assertEquals(17, this.centuryFromYear.centuryFromYear(1700));
    }

    @Test
    public void test2001() {
        assertEquals(21, this.centuryFromYear.centuryFromYear(2001));
    }

    @Test
    public void test200() {
        assertEquals(2, this.centuryFromYear.centuryFromYear(200));
    }

    @Test
    public void test374() {
        assertEquals(4, this.centuryFromYear.centuryFromYear(374));
    }

    @Test
    public void testNegativeNumber() {
        assertEquals(-1, this.centuryFromYear.centuryFromYear(-100));
    }
}