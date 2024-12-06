package org.example.service;

import org.example.enums.ActionType;
import org.example.model.Player;

import java.util.Map;

class SnakeAndLadderMoveStrategy implements MoveStrategy {
    private final Map<Integer, Integer> snakes;
    private final Map<Integer, Integer> ladders;

    public SnakeAndLadderMoveStrategy(Map<Integer, Integer> snakes, Map<Integer, Integer> ladders) {
        this.snakes = snakes;
        this.ladders = ladders;
    }

    @Override
    public ActionType move(Player player, int moveValue) {
        int newPosition = player.getPosition() + moveValue;

        if (snakes.containsKey(newPosition)) {
            System.out.println("Oops! Player " + player.getName() + " bitten by a snake!");
            player.setPosition(snakes.get(newPosition));
            return ActionType.SNAKE_BITE;
        } else if (ladders.containsKey(newPosition)) {
            System.out.println("Yay! Player " + player.getName() + " climbed a ladder!");
            player.setPosition(ladders.get(newPosition));
            return ActionType.LADDER_CLIMB;
        } else {
            player.setPosition(newPosition);
            return ActionType.NORMAL_MOVE;
        }
    }
}
