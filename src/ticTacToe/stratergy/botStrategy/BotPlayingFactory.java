package ticTacToe.stratergy.botStrategy;

import ticTacToe.models.BotDificulty;

public class BotPlayingFactory {

    public static BotStrategy getStartegyForBot(BotDificulty b){
        if(b.equals(BotDificulty.EASY)){
            return new EasyPlayingStrategy();
        }
        return null;
    }

}
