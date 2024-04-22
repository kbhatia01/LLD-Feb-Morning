package ticTacToe.models;

import inheritance.B;

import java.util.Scanner;

public class Player {

    private int id;
    private String name;

    private playerType playerType;

    private Symbol symbol;

    Scanner scanner;

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

    public Player(String name, int id, playerType type, Symbol s){
        this.name=name;
        this.id=id;
        this.playerType=type;
        this.symbol=s;
        scanner = new Scanner(System.in);
    }

    public boolean validateInput(int row, int col){
        return true;
    }
    public Cell decideCell(Board b){
        System.out.println("Please mention a row..");
        int row = scanner.nextInt();
        System.out.println("Please mention a col..");
        int col = scanner.nextInt();

        if(!validateInput(row, col)){
            System.out.println("Invalid Input");
            return null;
        }

        return b.getGrid().get(row).get(col);

    }
}
