package AdderSubtractor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws Exception {
        Value v = new Value();
        Adder a = new Adder(v);
        Subtractor s = new Subtractor(v);

        ExecutorService es = Executors.newCachedThreadPool();
        Future<Void> val = es.submit(a);
        Future<Void> val2 = es.submit(s);
        val2.get();
        val.get();

        System.out.println(v.i);




    }
}
