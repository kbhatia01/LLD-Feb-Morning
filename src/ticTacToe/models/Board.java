package ticTacToe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int size;
    List<List<Cell>> grid;

    public Board(int dimension){
        this.size=dimension;
        grid = new ArrayList<>();
        for (int i=0;i<size;i++){
            grid.add(new ArrayList<>());
            for(int j = 0; j < size; j++) {
                grid.get(i).add(new Cell(i,j));
            }
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<List<Cell>> getGrid() {
        return grid;
    }

    public void setGrid(List<List<Cell>> grid) {
        this.grid = grid;
    }

    public void printBoard(){
        for (List<Cell> rows: grid) {
            for(Cell c:rows){
                c.display();
            }
            System.out.println();

        }
    }
}
