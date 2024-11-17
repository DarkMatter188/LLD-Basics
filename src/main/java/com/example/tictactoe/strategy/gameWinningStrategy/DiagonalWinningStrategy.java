package com.example.tictactoe.strategy.gameWinningStrategy;

import com.example.tictactoe.models.Board;
import com.example.tictactoe.models.Move;
import com.example.tictactoe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class DiagonalWinningStrategy implements GameWinningStrategy{
    private Map<Symbol, Integer> leftDiagonalMap = new HashMap<>();
    private Map<Symbol, Integer> rightDiagonalMap = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        Symbol symbol = move.getPlayer().getSymbol();
        if(row == col){
            //moves is present on leftDiagonal
            if(!leftDiagonalMap.containsKey(symbol)){
                leftDiagonalMap.put(symbol, 1);
            }else{
                leftDiagonalMap.put(symbol, leftDiagonalMap.get(symbol) + 1);
            }

            if(leftDiagonalMap.get(symbol) == board.getSize()) return true;
        }

        if(row + col == board.getSize() - 1){
            //Present on right diagonal
            if(!rightDiagonalMap.containsKey(symbol)){
                rightDiagonalMap.put(symbol, 1);
            }else{
                rightDiagonalMap.put(symbol, rightDiagonalMap.get(symbol) + 1);
            }

            if(rightDiagonalMap.get(symbol) == board.getSize()) return true;
        }
        return false;
    }
}
