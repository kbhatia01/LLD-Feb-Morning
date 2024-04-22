package ticTacToe.stratergy.winning;

import ticTacToe.models.Board;
import ticTacToe.models.Cell;

public class columnWinningStrategy implements WinningStrategy{
    @Override
    public boolean checkWinner(Cell c, Board b) {
        return false;
    }
}
