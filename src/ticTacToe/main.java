package ticTacToe;

import ticTacToe.Exceptions.InvalidBotCountException;
import ticTacToe.controller.GameController;
import ticTacToe.models.Game;
import ticTacToe.models.GameStatus;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws InvalidBotCountException {
        GameController gc = new GameController();

        Game g1 = gc.startGame(3, new ArrayList<>(), new ArrayList<>());

        gc.displayBoard(g1);

        while(g1.getGameStatus().equals(GameStatus.IN_PROGRESS)){
            gc.takeMove(g1);
            gc.displayBoard(g1);
        }

        if (g1.getGameStatus().equals(GameStatus.SUCCESS)){
            System.out.println("winner is " + g1.getWinner().getName());
        }
        else if (g1.getGameStatus().equals(GameStatus.DRAW)){
            System.out.println("game ended as draw...");
        }


    }
}
