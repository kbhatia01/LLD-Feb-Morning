package ticTacToe.stratergy.botStrategy;

import ticTacToe.models.Board;
import ticTacToe.models.Cell;

public interface BotStrategy {
    public Cell decideMove(Board b);
}
