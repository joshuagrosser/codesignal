package com.grosser.codesignal.playground;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;

public class BinaryTreeTest {

    BinaryTree<Integer> root;

    @Before
    public void before(){
        root = new BinaryTree<>(100);
        root.left = new BinaryTree<>(1);
        root.left.left = new BinaryTree<>(24);
        root.left.right = new BinaryTree<>(25);
        root.right = new BinaryTree<>(50);
        root.right.left = new BinaryTree<>(51);
        root.right.right = new BinaryTree<>(75);
    }

    @Test
    public void testDFS001(){
        BinaryTree<Integer> result = root.depthFirstSearch(75);
        assertEquals(75, (int)result.value);
    }

    @Test
    public void testDFS002() {
        BinaryTree<Integer> result = root.depthFirstSearch(51);
        assertEquals(51, (int)result.value);
    }

    @Test
    public void testDFS003() {
        BinaryTree<Integer> result = root.depthFirstSearch(100);
        assertEquals(100, (int)result.value);
    }

    @Test
    public void testDFS004() {
        BinaryTree<Integer> result = root.depthFirstSearch(1);
        assertEquals(1, (int)result.value);
    }

    @Test
    public void testDFS005() {
        BinaryTree<Integer> result = root.depthFirstSearch(99);
        assertNull(result);
    }

    @Test
    public void testBFS001() {
        root.breadthFirstTraversal(1);
    }


}