package ProducerConsumerSemaphore;


import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{

    private Store s;
    private Semaphore pSema;
    private Semaphore cSema;

    Consumer(Store s, Semaphore producerSema,
             Semaphore consumerSema) {
        this.s = s;
        pSema = producerSema;
        cSema = consumerSema;

    }
    @Override
    public void run() {
        while (true){
            try {
                cSema.acquire();
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            s.buy();

            pSema.release();

        }
    }
}
