package org.example.service;

import org.example.enums.ActionType;
import org.example.model.Player;

public interface MoveStrategy {
    ActionType move(Player player, int moveValue);
}