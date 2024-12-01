package com.example.tictactoe.models;
import com.example.tictactoe.exceptions.DuplicateSymbolFoundException;
import com.example.tictactoe.exceptions.InvalidPlayerCountException;
import com.example.tictactoe.strategy.gameWinningStrategy.ColumnWinningStrategy;
import com.example.tictactoe.strategy.gameWinningStrategy.DiagonalWinningStrategy;
import com.example.tictactoe.strategy.gameWinningStrategy.GameWinningStrategy;
import com.example.tictactoe.strategy.gameWinningStrategy.RowWinningStrategy;

import java.util.*;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private Player winner;
    private int nextPlayerMoveIndex;
    private GameState gameState;
    private List<GameWinningStrategy> winningStrategies;

    private Game(int dimension, List<Player> players, List<GameWinningStrategy> winningStrategies) {
        this.board = new Board(dimension);
        this.players = players;
        this.moves = new ArrayList<>();
        this.nextPlayerMoveIndex = 0;
        this.gameState = GameState.IN_PROGRESS;
        this.winningStrategies = winningStrategies;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public int getNextPlayerMoveIndex() {
        return nextPlayerMoveIndex;
    }

    public void setNextPlayerMoveIndex(int nextPlayerMoveIndex) {
        this.nextPlayerMoveIndex = nextPlayerMoveIndex;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public void displayBoard(){
        board.printBoard();
    }
    private boolean validateMove(Move move, Board board){
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        Cell cell = board.getBoard().get(row).get(col);
        return col >= 0 && col < board.getSize()
                && row >= 0 && row < board.getSize()
                && cell.isEmpty();
    }

    public void makeMove(){
        Player currentPlayer = players.get(nextPlayerMoveIndex);

        System.out.println("It is " + currentPlayer.getName() + "'s turn");
        Move move = currentPlayer.makeMove(board);

        //Validate move first after getting input
        validateMove(move, board);
        //Place move on the board
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        Cell cell = board.getBoard().get(row).get(col);
        cell.setPlayer(currentPlayer);
        cell.setCellState(CellState.FILLED);

        Move finalMove = new Move(currentPlayer, cell);
        nextPlayerMoveIndex += 1;
        nextPlayerMoveIndex %= players.size();

        //Check the winner. - Strategy
        if(checkWinner(board, finalMove)){
            gameState = GameState.ENDED;
            winner = currentPlayer;
        }else if(moves.size() == board.getSize() * board.getSize()){
            //DRAW Condition
            gameState = GameState.DRAW;
        }
    }

    private boolean checkWinner(Board board, Move move){
        //Check all gameWinningStrategy
        for(GameWinningStrategy winningStrategy : winningStrategies){
            if(winningStrategy.checkWinner(board, move)) {
                return true;
            }
        }
        return false;
    }

    //Builder pattern for building game
    public static class Builder{
        private int dimension;
        private List<Player> players;

        public int getDimension() {
            return dimension;
        }

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public List<Player> getPlayers() {
            return players;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }
        private void validateCount() throws InvalidPlayerCountException {
            if(players.size() != dimension - 1){
                throw new InvalidPlayerCountException("No of players should be one less than board dimension!");
            }
        }

        private void validateUniqueSymbols() throws DuplicateSymbolFoundException {
            Map<Character, Integer> symbolCount = new HashMap<>();

            for(Player player : players){
                if(!symbolCount.containsKey(player.getSymbol().getaChar())){
                    symbolCount.put(player.getSymbol().getaChar(), 1);
                }
                else{
                    symbolCount.put(player.getSymbol().getaChar(),
                            symbolCount.get(player.getSymbol().getaChar()) + 1);
                }
                if(symbolCount.get(player.getSymbol().getaChar()) > 1){
                    throw new DuplicateSymbolFoundException("Players cannot have duplicate symbols!");
                }

            }
        }
        private void validateBotCount(){
            int botCount = 0;
            for(Player player : players){
                if(player.getPlayerType().equals(PlayerType.BOT)){
                    botCount++;
                }
            }
            if(botCount > 1){
                throw new RuntimeException("Only 1 bot is allowed per game!");
            }
        }
        private void validateGame(int dimension, List<Player> players) throws InvalidPlayerCountException, DuplicateSymbolFoundException {
            validateCount();
            validateUniqueSymbols();
            validateBotCount();
        }
        public Game build() throws InvalidPlayerCountException, DuplicateSymbolFoundException {
            //Validations
            validateGame(dimension, players);
            return new Game(
              dimension,
              players,
                    List.of(new RowWinningStrategy(),
                            new ColumnWinningStrategy(),
                            new DiagonalWinningStrategy())
            );
        }
    }
}
