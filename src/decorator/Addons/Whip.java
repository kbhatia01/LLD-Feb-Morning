package decorator.Addons;

import decorator.Beverage;

public class Whip implements Addon{
    Beverage b;

    public Whip(Beverage b){
        this.b = b;
    }
    @Override
    public int getPrice() {
        return b.getPrice() + 40;
    }
}
