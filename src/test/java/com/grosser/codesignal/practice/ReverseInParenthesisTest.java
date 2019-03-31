package com.grosser.codesignal.practice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ReverseInParenthesisTest {

    @Autowired
    ReverseInParenthesis instance;

    @Test
    public void test001() {
        assertEquals("abc321", instance.reverseInParentheses("abc(123)"));
    }

    @Test
    public void test002() {
        assertEquals("rab", instance.reverseInParentheses("(bar)"));
    }

    @Test
    public void test003() {
        assertEquals("foorabbaz", instance.reverseInParentheses("foo(bar)baz"));
    }

    @Test
    public void test004() {
        assertEquals("foorabbazmilb", instance.reverseInParentheses("foo(bar)baz(blim)"));
    }

    @Test
    public void test005() {
        assertEquals("foobazrabblim", instance.reverseInParentheses("foo(bar(baz))blim"));
    }

//

}