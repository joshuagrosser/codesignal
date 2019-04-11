package com.grosser.codesignal.interview;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class RemoveKFromListTest {

    @Autowired
    RemoveKFromList instance;

    @Test
    public void test001() {
        ListNode<Integer> node = generate(new int[]{3, 1, 2, 3, 4, 5});
        ListNode<Integer> result = instance.removeKFromList(node, 3);
        System.out.println(result);
    }

    public ListNode<Integer> generate(int[] vals) {
        ListNode<Integer> currentNode = new ListNode<>(vals[0]);
        ListNode<Integer> originalNode = currentNode;
        for (int i = 1; i < vals.length; i++) {
            ListNode<Integer> nextNode = new ListNode<>(vals[i]);
            currentNode.next = nextNode;
            currentNode = nextNode;
        }
        return originalNode;
    }

}