package ticTacToe.models;

public class Bot extends Player{

    private BotDificulty botDificulty;

    public BotDificulty getBotDificulty() {
        return botDificulty;
    }

    public void setBotDificulty(BotDificulty botDificulty) {
        this.botDificulty = botDificulty;
    }
}
