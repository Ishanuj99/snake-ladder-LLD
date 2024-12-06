package org.example.service;

import java.util.Random;

public class DiceRollServiceImpl {
    public int rollDice(){
        Random random = new Random();
        int diceRollValue = random.nextInt(6) +1;
        return diceRollValue;
    }

}
