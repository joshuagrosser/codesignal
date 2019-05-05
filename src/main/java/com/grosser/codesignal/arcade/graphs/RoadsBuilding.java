package com.grosser.codesignal.arcade.graphs;

import java.util.ArrayList;
import java.util.List;

public class RoadsBuilding {

    int[][] roadsBuilding(int cities, int[][] roads) {
        // This problem is asking us to build a COMPLETE GRAPH, meaning each vertex is connected
        // to every other vertex. When using an adjacency matrix, the list of edges includes directional edges
        // in both directions. So regarding vertices A and B, there is one edge from A to B and one edge from
        // B to A.
        //
        // Approach: Need to take the input 2D matrix and turn it into an adjacency matrix by taking each pair
        // and finding the right place in the adjacency matrix to put it.
        List<int[]> list = new ArrayList<>();
        list.get(0);
        boolean[][] adjacency = new boolean[cities][cities];
        for(int i = 0; i < roads.length; i++){
            int source = roads[i][0];
            int dest = roads[i][1];
            adjacency[source][dest] = true;
            adjacency[dest][source] = true;
        }
        // Iterate through the adjacency matrix and determine which cities do not have alternate destinations.
        for(int j = 0; j < cities; j++){
            for(int k = 0; k < cities; k++){
                if(!adjacency[j][k] && (j < k)){
                    list.add(new int[]{j, k});
                }
            }
        }
        int[][] result = new int[list.size()][2];
        for(int m = 0; m < list.size(); m++){
            int[] item = list.get(m);
            result[m][0] = item[0];
            result[m][1] = item[1];
        }
        return result;
    }

}
