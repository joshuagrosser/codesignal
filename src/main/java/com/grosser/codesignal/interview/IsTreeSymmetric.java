package com.grosser.codesignal.interview;

import com.grosser.codesignal.playground.Tree;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@Component
public class IsTreeSymmetric {

    //
    // Definition for binary tree:
    // class Tree<T> {
    //   Tree(T x) {
    //     value = x;
    //   }
    //   T value;
    //   Tree<T> left;
    //   Tree<T> right;
    // }

    // Indexes at a level is 2^0 + 2^1 + 2^2 + 2^3 + 2^4
    // Number of nodes at a given level = 2^n, where n is the level
    boolean isTreeSymmetric(Tree<Integer> node) {

        // Strategy: perform a breadth-first traversal
        // For each level in the search, reverse the array of values on one side of the tree and compare to the other
        // If they are equal, the level is mirrored, so continue down the levels
        // If not, the level is not mirrored, so break and return false
        // If reaching the end without breaking, return true
        if (node == null) {
            return false;
        }

        boolean result = true;
        Queue<Tree<Integer>> toVisit = new LinkedList<>();
        List<Integer> visited = new LinkedList<>();
        toVisit.add(node);

        // Determine which level we are iterating over and start creating a list
        // When reaching the last node in a level, call isMirrored(list) to determine if the level is mirrored

        // Iterate over individual nodes
        while (!toVisit.isEmpty()) {
            Tree<Integer> currentNode = toVisit.remove();
            visited.add(currentNode.value);
            if (currentNode.left != null)
                toVisit.add(currentNode.left);
            if (currentNode.right != null)
                toVisit.add(currentNode.right);
        }

        System.out.println(visited);
        return result;
    }


//        // Compare the nodes at each level, starting from the bottom to the top
//        int level = 1;
//        while(level > 0){
//            // Get the nodes at the current level
//            int lowerBound = (int)Math.pow(2, level-1);
//            int upperBound = (int)Math.pow(2, level);
//
//            if(!isMirrored(visited.subList(lowerBound, upperBound))){
//                break;
//            }
//
//            // Determine if the nodes at the current level are mirrored
//            level++;
//        }

}
