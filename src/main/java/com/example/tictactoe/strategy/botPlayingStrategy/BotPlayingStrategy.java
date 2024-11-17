package com.example.tictactoe.strategy.botPlayingStrategy;

import com.example.tictactoe.models.Board;
import com.example.tictactoe.models.Move;

public interface BotPlayingStrategy {
    Move makeMove(Board board);
}
