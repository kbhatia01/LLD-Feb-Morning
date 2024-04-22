package ticTacToe.models;

import inheritance.B;
import ticTacToe.stratergy.botStrategy.BotPlayingFactory;
import ticTacToe.stratergy.botStrategy.BotStrategy;

public class Bot extends Player{

    private BotDificulty botDificulty;

    private BotStrategy bs;
    public BotDificulty getBotDificulty() {
        return botDificulty;
    }

    public void setBotDificulty(BotDificulty botDificulty) {
        this.botDificulty = botDificulty;

    }

    public Bot(int id, String name, Symbol s, BotDificulty d){
        super(name, id, playerType.BOT, s);
        this.botDificulty=d;
        this.bs = BotPlayingFactory.getStartegyForBot(d);
    }

    public Cell decideCell(Board b){
        System.out.println("Bot is playing..");
        return bs.decideMove(b);
    }

}
