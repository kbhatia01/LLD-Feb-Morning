package Generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Pair<Integer, String> p =new Pair<>();

        p.setX(10);
        p.setY("ABC");

        String y = p.getY();
        int z =  p.getX();

        System.out.println("X  & Y:" + y + " "+ z);


        Pair.doSomething(10,"abc");

        Pair p2 = new Pair();
        p2.setY("abc");
        p2.setX(10);


        List a = new ArrayList<>();
        a.add("10");
        a.add(10);
        a.add(10.00);

        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));

        }

        Pair<Integer, Integer> p3 = new Pair<>();
        double d = p3.addition(30,30);



    }
}
