package com.example.tictactoe.strategy.botPlayingStrategy;

import com.example.tictactoe.models.Board;
import com.example.tictactoe.models.Cell;
import com.example.tictactoe.models.Move;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy {

    @Override
    public Move makeMove(Board board) {
        //Iterate on each row and place symbol where it is empty
        for(List<Cell> cells : board.getBoard()){
            for(Cell cell : cells){
                if(cell.isEmpty()){
                    return new Move(
                            null,
                            cell
                    );
                }
            }
        }
        return null;
    }
}
