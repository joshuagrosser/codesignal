package com.grosser.codesignal.challenges;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SumOfConsecutive2Test {

    @Autowired
    SumOfConsecutive2 instance;

    @Test
    public void test001(){
        System.out.println(instance.isSumOfConsecutive2(9));
    }

}