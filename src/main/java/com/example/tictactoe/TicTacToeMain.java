package com.example.tictactoe;

import com.example.tictactoe.controller.GameController;
import com.example.tictactoe.exceptions.DuplicateSymbolFoundException;
import com.example.tictactoe.exceptions.InvalidPlayerCountException;
import com.example.tictactoe.models.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class TicTacToeMain {
    public static void main(String[] args) throws InvalidPlayerCountException, DuplicateSymbolFoundException {
        //Create the game
        System.out.println("Starting tictactoe game...");
        Scanner scanner = new Scanner(System.in);
        GameController gameController = new GameController();

        List<Player> players = new ArrayList<>();
        players.add(
                new Player("Apoorv", 1l, new Symbol('X'), PlayerType.HUMAN)
        );

        players.add(
                new Bot(2l, "Robot", new Symbol('O'), PlayerType.BOT, BotDifficultyLevel.EASY)
        );
        Game game = GameController.startGame(3, players);
        //Start and keep on playing game now

        while(gameController.getGameState(game).equals(GameState.IN_PROGRESS)){
            gameController.displayBoard(game);
            gameController.makeMove(game);
        }
        if(gameController.getGameState(game).equals(GameState.DRAW)){
            System.out.println("Game has DRAWN!");
        }else{
            gameController.displayBoard(game);
            System.out.println(gameController.getWinner(game).getName() +" has WON the game!");
        }
    }
}
