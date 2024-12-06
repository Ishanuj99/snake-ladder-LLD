package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.service.MoveStrategy;

import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
public class Board {
    int gridSize;
    int winningSquare;
    MoveStrategy moveStrategy;

    public void movePlayer(Player player, int moveValue){
        if (player.getPosition() + moveValue > gridSize) {
            System.out.println("Invalid move. Out of bounds!");
            return;
        }
        moveStrategy.move(player, moveValue);
    }
}
