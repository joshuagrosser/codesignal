package com.grosser.codesignal.interview;

import com.grosser.codesignal.playground.Tree;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class IsTreeSymmetricTest {
    
    @Autowired
    IsTreeSymmetric instance;
    
    @Test
    public void test001(){
        Tree<Integer> root = new Tree<>(5);
        root.left = new Tree<>(10);
        root.right = new Tree<>(15);
        root.left.left = new Tree<>(20);
        root.left.right = new Tree<>(25);
        root.right.left = new Tree<>(30);
        root.right.right = new Tree<>(35);
        
        assertTrue(instance.isTreeSymmetric(root));
    }

}