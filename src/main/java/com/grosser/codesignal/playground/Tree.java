package com.grosser.codesignal.playground;

@SuppressWarnings("Duplicates")
public class Tree<T> {
    public Tree(T x) {
        value = x;
    }

    public T value;
    public Tree<T> left;
    public Tree<T> right;

    @Override
    public String toString() {
        return "Tree{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}