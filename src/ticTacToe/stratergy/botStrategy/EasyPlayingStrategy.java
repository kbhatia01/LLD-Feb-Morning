package ticTacToe.stratergy.botStrategy;

import ticTacToe.models.Board;
import ticTacToe.models.Cell;
import ticTacToe.models.CellStatus;

import java.util.List;

public class EasyPlayingStrategy implements BotStrategy{


    @Override
    public Cell decideMove(Board b) {
        for(List<Cell> row: b.getGrid()){
            for(Cell c:row){
                if(c.getCellStatus().equals(CellStatus.EMPTY)){
                    return c;
                }
            }
        }
        return null;
    }
}
