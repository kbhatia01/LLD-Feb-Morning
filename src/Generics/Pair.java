package Generics;

import inheritance.D;

import java.util.List;

public class Pair <V, T>{
    V x;
    T  y;


    public void setX(V x) {
        this.x = x;

    }

    public void setY(T y) {
        this.y = y;
    }


    public T getY(){
        return y;
    }

    public V getX() {
        return x;
    }

    public  static <s,v> void doSomething(s x, v y){

        System.out.println("Printing x: "+ x + " Y: "+ y);

    }

    public <s,v> void doSomething2(s x, v y){
        System.out.println("Printing x: "+ x + " Y: "+ y);
    }

    public <A extends Number> double addition (A first, A second){
        return first.doubleValue()+second.doubleValue();

    }

}
