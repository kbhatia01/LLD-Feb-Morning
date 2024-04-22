package ticTacToe.stratergy.winning;

import ticTacToe.models.Board;
import ticTacToe.models.Cell;
import ticTacToe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class RowWinningStrategy implements WinningStrategy{

    Map<Integer, HashMap<Symbol, Integer>> counts = new HashMap<>();
    public boolean checkWinner(Cell c, Board b) {
//        |0|->{"x":1, "y":0}
//        |1|->{"x":0, "y":0}
//        |2|->{"x":0, "y":0}
        int row = c.getRow();
        Symbol s = c.getPlayer().getSymbol();

        if(!counts.containsKey(row)){
            counts.put(row,new HashMap<>());
        }
        HashMap<Symbol, Integer> hs = counts.get(row);

        if (!hs.containsKey(s)){
            hs.put(s, 0);
        }
        hs.put(s, hs.get(s)+1);

        return hs.get(s) == b.getSize();

    }

    @Override
    public void handleUndo(Cell c, Board b) {
        int row = c.getRow();
        Symbol s = c.getPlayer().getSymbol();
        Map<Symbol, Integer> rowMap = counts.get(row);
        rowMap.put(s, rowMap.get(s)-1);
    }

}
