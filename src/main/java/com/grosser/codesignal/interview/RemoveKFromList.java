package com.grosser.codesignal.interview;

import org.springframework.stereotype.Component;

/**
 * Note: Try to solve this task in O(n) time using O(1) additional space, where n is the number of elements in the list,
 * since this is what you'll be asked to do during an interview.
 * <p>
 * Given a singly linked list of integers l and an integer k, remove all elements from list l that have a value equal to
 * k.
 * <p>
 * Example
 * <p>
 * For l = [3, 1, 2, 3, 4, 5] and k = 3, the output should be removeKFromList(l, k) = [1, 2, 4, 5]; For l = [1, 2, 3, 4,
 * 5, 6, 7] and k = 10, the output should be removeKFromList(l, k) = [1, 2, 3, 4, 5, 6, 7].
 */
@Component
public class RemoveKFromList {
    ListNode<Integer> removeKFromList(ListNode<Integer> current, int k) {
        ListNode<Integer> beginning = current;
        ListNode<Integer> prev = null;
        while (current != null) {
            if (current.value == k) {
                if (prev != null) {
                    prev.next = current.next;
                } else {
                    beginning = current.next;
                }
            } else {
                prev = current;
            }
            current = current.next;
        }
        return beginning;
    }
}
