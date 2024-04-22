package ticTacToe.stratergy.winning;

import ticTacToe.models.Board;
import ticTacToe.models.Cell;
import ticTacToe.models.Player;

public interface WinningStrategy {
    public boolean checkWinner(Cell c, Board b);
}
