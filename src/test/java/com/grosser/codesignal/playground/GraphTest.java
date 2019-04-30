package com.grosser.codesignal.playground;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GraphTest {

    @Test
    public void testConstructor(){
        List<Vertex<String>> list = new ArrayList<>();
        Vertex<String> vertex001 = new Vertex<>(1, "sum 41");
        list.add(vertex001);
        Vertex<String> vertex002 = new Vertex<>(2, "breaking benjamin");
        list.add(vertex002);
        Vertex<String> vertex003 = new Vertex<>(3, "rise against");
        list.add(vertex003);
        Vertex<String> vertex004 = new Vertex<>(4, "trivium");
        list.add(vertex004);
        Vertex<String> vertex005 = new Vertex<>(5, "bring me the horizon");
        list.add(vertex005);
        Graph<String> graph = new Graph<>(list);
        graph.addEdge(vertex001, vertex002);
        graph.addEdge(vertex001, vertex003);
        graph.addEdge(vertex001, vertex004);
        graph.addEdge(vertex001, vertex005);
        graph.addEdge(vertex003, vertex001);
        graph.addEdge(vertex003, vertex002);
        graph.addEdge(vertex003, vertex005);

        assertEquals(list.size(), graph.getVertices().size());
        System.out.println(graph.toString());
    }

    @Test
    public void testAddingSameEdgeDoesNotCreateDuplicate() {
        List<Vertex<String>> list = new ArrayList<>();
        Vertex<String> vertex001 = new Vertex<>(1, "sum 41");
        list.add(vertex001);
        Vertex<String> vertex002 = new Vertex<>(2, "breaking benjamin");
        list.add(vertex002);
        Graph<String> graph = new Graph<>(list);
        graph.addEdge(vertex001, vertex002);
        graph.addEdge(vertex001, vertex002);

        assertEquals(2, graph.getAdjacencyList().size());
        assertEquals(1, graph.getAdjacencyList().get(0).size());
        assertEquals(1, graph.getAdjacencyList().get(1).size());
        System.out.println(graph.toString());
    }



}