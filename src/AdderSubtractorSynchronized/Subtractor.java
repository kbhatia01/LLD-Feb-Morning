package AdderSubtractorSynchronized;



import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    private Value v;
    private Lock l2;

    Subtractor(Value v, Lock l){
        this.v = v;
        this.l2 = l;
    }
    @Override
    public Void call() throws Exception {
        for (int i = 0; i < 1000000; i++) {
            System.out.println("Subtractor");

//           synchronized (this){ // lock
//               this.v.i -= 1;
//           } // unlock

            this.v.decrement();

        }
        return null;
    }
}
