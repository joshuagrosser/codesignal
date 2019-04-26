package com.grosser.codesignal.playground;

import java.util.Objects;

public class BinaryTree<T> {

    BinaryTree(T x) {
        value = x;
    }
    T value;
    BinaryTree<T> left;
    BinaryTree<T> right;

    /**
     * Return the first node found in a tree with the specified value, or null if the value was not found.
     */
    BinaryTree<T> depthFirstSearch(T toFind) {
        if (toFind != null) {
            System.out.println("Visiting node with value: " + value);
            // Start at the current node
            // Check the value to see if it is a match
            if (toFind.equals(value)) {
                return this;
            }

            // If not, check the left node and recurse
            if (left != null) {
                BinaryTree<T> leftBinaryTree = left.depthFirstSearch(toFind);
                if (leftBinaryTree != null) {
                    return leftBinaryTree;
                }
            }
            // If not, check the right node and recurse
            if (right != null) {
                BinaryTree<T> rightBinaryTree = right.depthFirstSearch(toFind);
                if (rightBinaryTree != null) {
                    return rightBinaryTree;
                }
            }
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BinaryTree<?> that = (BinaryTree<?>) o;
        return Objects.equals(value, that.value) &&
                Objects.equals(left, that.left) &&
                Objects.equals(right, that.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, left, right);
    }

    @Override
    public String toString() {
        return "Tree{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
