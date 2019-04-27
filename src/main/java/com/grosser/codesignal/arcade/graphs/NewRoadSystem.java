package com.grosser.codesignal.arcade.graphs;

import java.util.HashMap;
import java.util.Map;

/**
 * Once upon a time, in a kingdom far, far away, there lived a King Byteasar I. As a kind and wise ruler, he did
 * everything in his (unlimited) power to make life for his subjects comfortable and pleasant. One cold evening a
 * messenger arrived at the king's castle with the latest news: all kings in the Kingdoms Union had started enforcing
 * traffic laws! In order to not lose his membership in the Union, King Byteasar decided he must do the same within his
 * kingdom. But what would the citizens think of it?
 * <p>
 * The king decided to start introducing the changes with something more or less simple: change all the roads in the
 * kingdom from two-directional to one-directional (one-way). He personally prepared the roadRegister of the new roads,
 * and now he needs to make sure that the road system is convenient and there will be no traffic jams, i.e. each city
 * has the same number of incoming and outgoing roads. As the Hand of the King, you're the one who he has decreed must
 * check his calculations.
 */
public class NewRoadSystem {

    boolean newRoadSystem(boolean[][] roadRegister) {
        Map<Integer, Integer> cityToInboundCount = new HashMap<>();
        Map<Integer, Integer> cityToOutboundCount = new HashMap<>();
        // Validate that each city has the same number of inbound and outbound roads.
        // For each city, if the number of true values in the associated row
        // equals the number of true values in the associated column, then the
        // city has the same number of inbound and outbound roads (edges).
        for (int i = 0; i < roadRegister.length; i++) {
            for (int j = 0; j < roadRegister[i].length; j++) {
                // starting at 0,0
                if (roadRegister[i][j]) {
                    // i connects to j
                    // j has an inbound and i has an outbound
                    int inboundCount = cityToInboundCount.getOrDefault(j, 0) + 1;
                    cityToInboundCount.put(j, inboundCount);
                    int outboundCount = cityToOutboundCount.getOrDefault(i, 0) + 1;
                    cityToOutboundCount.put(i, outboundCount);
                }
            }
        }
        // Iterate through each index and compare the inbound count to outbound count
        for (int i = 0; i < cityToInboundCount.keySet().size(); i++) {
            if (!cityToInboundCount.get(i).equals(cityToOutboundCount.get(i))) {
                return false;
            }
        }
        return true;
    }

}
