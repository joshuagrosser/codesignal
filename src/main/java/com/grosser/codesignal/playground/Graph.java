package com.grosser.codesignal.playground;

import java.util.*;

/**
 * General-purpose Graph implementation with standard DFS and BFS algorithms.
 * @param <T> the type of object contained in each vertex in the graph.
 */
public class Graph<T> {
    private List<Vertex<T>> vertices;
    private List<LinkedList<Integer>> adjacencyList;

    /**
     * Create a new Graph with n vertices.
     * @param vertices a list of the vertices.
     */
    public Graph(List<Vertex<T>> vertices){
        this.vertices = vertices;
        this.adjacencyList = new ArrayList<>(vertices.size());
        int counter = vertices.size();
        while(counter > 0){
            this.adjacencyList.add(new LinkedList<>());
            counter--;
        }
    }

    /**
     * Add directed edge between two vertices.
     * @param a vertex A
     * @param b vertex B
     */
    public void addEdge(Vertex<T> a, Vertex<T> b){
        LinkedList<Integer> edgesA = adjacencyList.get(a.getId() - 1);
        LinkedList<Integer> edgesB = adjacencyList.get(b.getId() - 1);
        if(!edgesA.contains(b.getId())){
            edgesA.push(b.getId());
        }
        if(!edgesB.contains(a.getId())){
            edgesB.push(a.getId());
        }
    }

    /**
     * Performs a BFS to find the specified object.
     * @param toFind the object to search for.
     * @return the vertex that the object was found in.
     */
    public Graph<T> breadthFirstSearch(T toFind){
        throw new UnsupportedOperationException();
    }

    /**
     * Performs a DFS to find the specified object.
     * @param toFind the object to search for.
     * @return the vertex that the object was found in.
     */
    public Graph<T> depthFirstSearch(T toFind){

        Stack<Vertex<T>> stack = new Stack<>();

        // TODO Rule 1: Find the next unvisited node that is adjacent to the current node and push it on the stack
        Vertex<T> root = vertices.get(0);
        root.setVisited(true);
        stack.push(root);

        // TODO Rule 2: If Rule 1 is not possible, pop a vertex off the stack (backtracking)
        // Recursive DFS vs iterative DFS?
        throw new UnsupportedOperationException();
    }

    public List<Vertex<T>> getVertices() {
        return vertices;
    }

    public List<LinkedList<Integer>> getAdjacencyList() {
        return adjacencyList;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Vertices: ");
        for(Vertex<T> vertex : vertices){
            sb.append(vertex.toString());
            sb.append(" ");
        }
        sb.trimToSize();
        sb.append("\nAdjacency List: ");
        for(int i = 0; i < adjacencyList.size(); i++){
            sb.append("\nvertex[").append(i).append("]: ");
            sb.append(adjacencyList.get(i));
        }
        return sb.toString();
    }
}
