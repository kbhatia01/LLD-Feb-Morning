package AdderSubtractorMutex;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) throws Exception {
        Value v = new Value();
        Lock l = new ReentrantLock();
        Adder a = new Adder(v, l);
        Subtractor s = new Subtractor(v, l);

        ExecutorService es = Executors.newCachedThreadPool();
        Future<Void> val = es.submit(a);
        Future<Void> val2 = es.submit(s);
        val2.get();
        val.get();

        System.out.println(v.i);




    }
}
