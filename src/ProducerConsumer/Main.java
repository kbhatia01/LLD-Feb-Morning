package ProducerConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Store s = new Store(5);
        ExecutorService e = Executors.newCachedThreadPool();

        for (int i = 0; i < 8; i++) {
            Producer p = new Producer(s);
            e.submit(p);
        }
        for (int i = 0; i < 20; i++) {
            Consumer c = new Consumer(s);
            e.submit(c);
        }
    }
}
