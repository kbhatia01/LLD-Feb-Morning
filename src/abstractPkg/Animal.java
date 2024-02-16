package abstractPkg;

import java.util.*;

public abstract class Animal {
    String name;
    int age;
    String color;

    void printName(){
        System.out.println(this.name);
    }

    abstract void eat();

    Animal(String name){
        this.name = name;
    }
    Animal(){

    }


}
