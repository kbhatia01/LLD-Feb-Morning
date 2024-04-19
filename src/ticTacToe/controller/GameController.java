package ticTacToe.controller;

import ticTacToe.Exceptions.InvalidBotCountException;
import ticTacToe.models.Game;
import ticTacToe.models.Player;
import ticTacToe.stratergy.WinningStrategy;

import java.util.List;

public class GameController {

    public Game startGame(int size, List<Player> players,
                          List<WinningStrategy> winningStrategies)
    throws InvalidBotCountException {

        return Game.getBuilder().setDimension(size)
                .setPlayers(players)
                .setWs(winningStrategies)
                .build();


    }

    public void displayBoard(Game g){
        g.getBoard().printBoard();
    }

    public void takeMove(Game g1){
        // TODO: implement it..
    }
}


// client: -> Game Controller -> Service/models..

// 1. Start the game and set status to inProgress..

// 2. display board..

// 3. take a move..

// If game status changed.. : display result..
// undo if input given..

