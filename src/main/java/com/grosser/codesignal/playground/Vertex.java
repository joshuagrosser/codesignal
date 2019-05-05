package com.grosser.codesignal.playground;

import java.util.Objects;

public class Vertex<T> {
    private int id;
    private T value;
    private boolean visited = false;

    public Vertex(int id, T obj){
        this.id = id;
        this.value = obj;
    }

    public String toString(){
        return value.toString();
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public int getId() {
        return id;
    }

    public T getValue(){
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertex<?> vertex = (Vertex<?>) o;
        return id == vertex.id &&
                visited == vertex.visited &&
                Objects.equals(value, vertex.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value, visited);
    }
}