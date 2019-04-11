package com.grosser.codesignal.interview;

import org.springframework.stereotype.Component;

/**
 * Given a binary tree t and an integer s, determine whether there is a root to leaf path in t such that the sum of
 * vertex values equals s.
 */
@Component
public class HasPathWithGivenSum {

    boolean hasPathWithGivenSum(Tree<Integer> t, int s) {
        return dfs(t, 0, s);
    }

    public boolean dfs(Tree<Integer> node, int currentSum, int desiredSum) {
        if(node != null) {
            currentSum += node.value;

            if (node.left != null) {
                // More leaves to the left
                if (dfs(node.left, currentSum, desiredSum)) {
                    return true;
                }
            }

            if (node.right != null) {
                // more leaves to the right
                if (dfs(node.right, currentSum, desiredSum)) {
                    return true;
                }
            }
            System.out.println(currentSum);
            return currentSum == desiredSum;
        } else {
            return false;
        }
    }
}
