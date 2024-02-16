package interfaces;

public class Dog extends mammal implements runner{

    @Override
    public void run() {
        System.out.println("running...");
    }

    void doSomething(){

    }
}
