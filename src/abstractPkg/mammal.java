package abstractPkg;

public abstract class mammal extends Animal {

    @Override
    final void eat() {
        System.out.println("eating");
    }

    void eat(String s){
        System.out.println("eating");

    }

    mammal(){

    }
}
