package com.grosser.codesignal.arcade.intro;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringsRearrangementTest {

    @Test
    public void test001() {
        StringsRearrangement instance = new StringsRearrangement();
        assertFalse(instance.stringsRearrangement(new String[]{"aba", "bbb", "bab"}));
    }

    @Test
    public void test002() {
        StringsRearrangement instance = new StringsRearrangement();
        assertFalse(instance.stringsRearrangement(new String[]{"q", "q"}));
    }

    @Test
    public void test003() {
        StringsRearrangement instance = new StringsRearrangement();
        assertTrue(instance.stringsRearrangement(new String[]{"abc", "bef", "bcc", "bec", "bbc", "bdc"}));
    }


}