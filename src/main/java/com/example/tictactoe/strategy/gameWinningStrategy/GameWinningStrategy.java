package com.example.tictactoe.strategy.gameWinningStrategy;

import com.example.tictactoe.models.Board;
import com.example.tictactoe.models.Move;

public interface GameWinningStrategy {
    boolean checkWinner(Board board, Move move);
}
