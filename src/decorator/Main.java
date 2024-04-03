package decorator;

import decorator.Addons.Milk;
import decorator.Addons.Waffer;

public class Main {
    public static void main(String[] args) {

        Beverage b = new Espresso();
        b = new Milk(b);
        b = new Waffer(b);
        System.out.println(b.getPrice());
    }
}
