package com.example.tictactoe.controller;

import com.example.tictactoe.models.Game;
import com.example.tictactoe.models.GameState;
import com.example.tictactoe.models.Player;
import com.example.tictactoe.exceptions.DuplicateSymbolFoundException;
import com.example.tictactoe.exceptions.InvalidPlayerCountException;

import java.util.List;

public class GameController {
    public static Game startGame(int dimension, List<Player> players) throws InvalidPlayerCountException, DuplicateSymbolFoundException {

        return Game.getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .build();
    }

    public void makeMove(Game game){
        game.makeMove();
    }

    public Player getWinner(Game game){
        return game.getWinner();
    }

    public void undo(Game game){

    }

    public void displayBoard(Game game){
        game.displayBoard();
    }

    public GameState getGameState(Game game){
        return game.getGameState();
    }
}
