package com.grosser.codesignal.interview;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class HasPathWithGivenSumTest {

    @Autowired
    HasPathWithGivenSum instance;

    @Test
    public void test001() {

        Tree<Integer> tree = new Tree<>(4);
    }

}