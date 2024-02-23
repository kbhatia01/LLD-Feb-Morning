package ProducerConsumerSemaphore;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Store s = new Store(5);
        ExecutorService e = Executors.newCachedThreadPool();
        Semaphore ProducerSema = new Semaphore(5);
        Semaphore ConsumerSema = new Semaphore(0);


        for (int i = 0; i < 8; i++) {
            Producer p = new Producer(s, ProducerSema, ConsumerSema);
            e.submit(p);
        }
        for (int i = 0; i < 20; i++) {
            Consumer c = new Consumer(s, ProducerSema, ConsumerSema);
            e.submit(c);
        }
    }
}
