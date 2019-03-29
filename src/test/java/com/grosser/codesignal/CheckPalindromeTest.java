package com.grosser.codesignal;

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
    CheckPalindrome palindrome;

    @Test
    public void testNotNull() {
        assertNotNull(palindrome);
    }

    @Test
    public void checkPalindrome001() {
        assertTrue(palindrome.checkPalindrome("aabaa"));
    }

    @Test
    public void checkPalindrome002() {
        assertFalse(palindrome.checkPalindrome("abac"));
    }

    @Test
    public void checkPalindrome003() {
        assertTrue(palindrome.checkPalindrome("a"));
    }

    @Test
    public void checkPalindrome004() {
        assertFalse(palindrome.checkPalindrome("az"));
    }

    @Test
    public void checkPalindrome005(){
        assertTrue(palindrome.checkPalindrome("abacaba"));
    }

    @Test
    public void checkPalindrome006(){
        assertTrue(palindrome.checkPalindrome("z"));
    }

    @Test
    public void checkPalindrome007(){
        assertFalse(palindrome.checkPalindrome("01"));
    }

    @Test
    public void checkPalindrome008(){
        assertTrue(palindrome.checkPalindrome("101"));
    }
}