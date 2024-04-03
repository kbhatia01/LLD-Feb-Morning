package decorator.Addons;

import decorator.Beverage;

public class Waffer implements Addon{
    Beverage b;

    public Waffer(Beverage b){
        this.b = b;
    }
    @Override
    public int getPrice() {
        return b.getPrice() + 50;
    }
}
