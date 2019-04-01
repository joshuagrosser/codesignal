package com.grosser.codesignal.arcade.intro;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CheckPalindromeTest {

    @Autowired
    CheckPalindrome instance;

    @Test
    public void testNotNull() {
        assertNotNull(instance);
    }

    @Test
    public void checkPalindrome001() {
        assertTrue(instance.checkPalindrome("aabaa"));
    }

    @Test
    public void checkPalindrome002() {
        assertFalse(instance.checkPalindrome("abac"));
    }

    @Test
    public void checkPalindrome003() {
        assertTrue(instance.checkPalindrome("a"));
    }

    @Test
    public void checkPalindrome004() {
        assertFalse(instance.checkPalindrome("az"));
    }

    @Test
    public void checkPalindrome005(){
        assertTrue(instance.checkPalindrome("abacaba"));
    }

    @Test
    public void checkPalindrome006(){
        assertTrue(instance.checkPalindrome("z"));
    }

    @Test
    public void checkPalindrome007(){
        assertFalse(instance.checkPalindrome("01"));
    }

    @Test
    public void checkPalindrome008(){
        assertTrue(instance.checkPalindrome("101"));
    }
}