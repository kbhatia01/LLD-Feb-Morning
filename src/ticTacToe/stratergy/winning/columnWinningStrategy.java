package ticTacToe.stratergy.winning;

import ticTacToe.models.Board;
import ticTacToe.models.Cell;
import ticTacToe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class columnWinningStrategy implements WinningStrategy{

    Map<Integer, HashMap<Symbol,Integer>> counts = new HashMap<>();

    @Override
    public boolean checkWinner(Cell c, Board b) {


        int col = c.getCol();
        Symbol s = c.getPlayer().getSymbol();

        if(!counts.containsKey(col)){
            counts.put(col,new HashMap<>());
        }
        HashMap<Symbol, Integer> hs = counts.get(col);

        if (!hs.containsKey(s)){
            hs.put(s, 0);
        }
        hs.put(s, hs.get(s)+1);

        return hs.get(s) == b.getSize();
    }

    @Override
    public void handleUndo(Cell c, Board b) {
        int row = c.getCol();
        Symbol s = c.getPlayer().getSymbol();
        Map<Symbol, Integer> rowMap = counts.get(row);
        rowMap.put(s, rowMap.get(s)-1);
    }
}
