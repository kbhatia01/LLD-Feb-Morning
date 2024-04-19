package ticTacToe.stratergy;

import ticTacToe.models.Board;
import ticTacToe.models.Player;

public interface WinningStrategy {
    public boolean checkWinner(Player p, Board b);
}
