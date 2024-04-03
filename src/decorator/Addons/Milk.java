package decorator.Addons;

import decorator.Beverage;

public class Milk implements Addon{

    Beverage b;

    public Milk(Beverage b){
        this.b = b;
    }
    @Override
    public int getPrice() {
        return b.getPrice() + 30;
    }
}
