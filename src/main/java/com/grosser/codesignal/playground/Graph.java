package com.grosser.codesignal.playground;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {

    // Create adjacency list
    boolean[][] roadRegister = new boolean[][]{{}};
    List<LinkedList<Integer>> adjacencyList = new ArrayList<>();

    public void createAdjacencyList(){
        for(int i = 0; i < roadRegister.length; i++){
            adjacencyList.add(new LinkedList<>());
            for(int j = 0; j < roadRegister[0].length; j++){
                if(roadRegister[i][j]){
                    adjacencyList.get(i).add(j);
                }
            }
        }
    }
}
