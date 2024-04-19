package ticTacToe.models;

public class Player {

    private int id;
    private String name;

    private playerType playerType;

    private Symbol symbol;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public playerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(playerType playerType) {
        this.playerType = playerType;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }
}
