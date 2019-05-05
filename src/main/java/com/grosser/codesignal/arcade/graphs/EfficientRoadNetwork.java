package com.grosser.codesignal.arcade.graphs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class EfficientRoadNetwork {

    boolean efficientRoadNetwork(int n, int[][] roads) {
        // Approach: use DFS to determine the maximum height of the graph from any given node

        // Convert the input to an adjacency map
        Map<Integer, LinkedList<Integer>> map = new HashMap<>();
        for(int i = 0; i < roads.length; i++){
            int from = roads[i][0];
            int to = roads[i][1];
            if(map.get(from) == null){
                LinkedList<Integer> nodes = new LinkedList<>();
                map.put(from, nodes);
            }
            map.get(from).add(to);
            if(map.get(to) == null){
                LinkedList<Integer> nodes = new LinkedList<>();
                map.put(to, nodes);
            }
            map.get(to).add(from);
        }

        // Use DFS on the adjacency map by traversing all nodes with unvisited siblings to find max depth,
        // and backtracking when reaching max depth. Create a running maxDepth var that tracks the max depth
        // found so far. If max depth ever exceeds 2, return false. If DFS has finished, and the max depth
        // has not exceeded 2, return true.

        Iterator it = map.entrySet().iterator();




        return false;
    }

}
