package org.example.service;

import java.util.HashMap;
import java.util.Map;

class SnakeAndLadderFactory {
    public static Map<Integer, Integer> createSnakes() {
        Map<Integer, Integer> snakes = new HashMap<>();
        snakes.put(14, 7);
        snakes.put(25, 2);
        return snakes;
    }

    public static Map<Integer, Integer> createLadders() {
        Map<Integer, Integer> ladders = new HashMap<>();
        ladders.put(3, 22);
        ladders.put(8, 26);
        return ladders;
    }
}
