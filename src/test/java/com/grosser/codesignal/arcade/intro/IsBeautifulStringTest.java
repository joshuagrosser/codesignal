package com.grosser.codesignal.arcade.intro;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsBeautifulStringTest {

    @Test
    public void isBeautifulString() {
        assertTrue(new IsBeautifulString().isBeautifulString("bbbaacdafe"));
    }

    @Test
    public void isBeautifulString002() {
        assertFalse(new IsBeautifulString().isBeautifulString("aabbb"));
    }

    @Test
    public void isBeautifulString003() {
        assertFalse(new IsBeautifulString().isBeautifulString("bbc"));
    }

    @Test
    public void isBeautifulString004() {
        assertFalse(new IsBeautifulString().isBeautifulString("abcdefghijklmnopqrstuvwxyzz"));
    }

    @Test
    public void isBeautifulString005() {
        assertFalse(new IsBeautifulString().isBeautifulString("fyudhrygiuhdfeis"));
    }
}