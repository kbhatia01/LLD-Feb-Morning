package AdderSubtractorMutex;


import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private Value v;
    private Lock l;

    Adder(Value v, Lock l){
        this.v = v;
        this.l = l;
    }
    @Override
    public Void call() throws Exception {
        for (int i = 0; i < 1000000; i++) {
            System.out.println("Adder");

            l.lock();
            this.v.i +=1;
            l.unlock();
        }
        return null;
    }
}
