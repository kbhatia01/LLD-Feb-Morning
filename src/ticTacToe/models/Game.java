package ticTacToe.models;

import inheritance.B;
import ticTacToe.Exceptions.InvalidBotCountException;
import ticTacToe.stratergy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private Board board;
    List<Player> players;
    private List<Cell> moves;

    private int nextPlayerTurn;

    private Player winner;
    private GameStatus gameStatus;

    List<WinningStrategy> winningStrategies;

    private Game(int dimension, List<Player> players, List<WinningStrategy> ws){
        this.board = new Board(dimension);
        this.players = players;
        this.winningStrategies = ws;
        this.moves = new ArrayList<>();
        this.gameStatus = GameStatus.IN_PROGRESS;
        this.nextPlayerTurn = 0;
        this.winner = null;

    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
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

    public List<Cell> getMoves() {
        return moves;
    }

    public void setMoves(List<Cell> moves) {
        this.moves = moves;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public int getNextPlayerTurn() {
        return nextPlayerTurn;
    }

    public void setNextPlayerTurn(int nextPlayerTurn) {
        this.nextPlayerTurn = nextPlayerTurn;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder{
        int dimension;
        List<Player> players;
        List<WinningStrategy> ws;

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

        public List<WinningStrategy> getWs() {
            return ws;
        }

        public Builder setWs(List<WinningStrategy> ws) {
            this.ws = ws;
            return this;
        }

        public void validate() throws InvalidBotCountException{
            int botCount=0;
            for (Player p : players){
                if(p.getPlayerType().equals(playerType.BOT)){
                    botCount+=1;
                }
            }
            if(botCount>1){
                throw new InvalidBotCountException();
            }
            if (players.size() > dimension-1){
                throw new RuntimeException();
            }
        }
        public Game build() throws InvalidBotCountException {
            validate();
            return new Game(this.dimension, this.players,
                    this.ws);
        }
    }




}
