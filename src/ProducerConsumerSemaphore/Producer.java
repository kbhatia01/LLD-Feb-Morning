package ProducerConsumerSemaphore;


import java.util.concurrent.Semaphore;

public class Producer implements Runnable{

    private Store s;
    private Semaphore pSema;
    private Semaphore cSema;

    Producer(Store s, Semaphore producerSema,
             Semaphore consumerSema){
        this.s = s;
        pSema=producerSema;
        cSema = consumerSema;
    }


    @Override
    public void run() {
        while(true){
            try {
                pSema.acquire();
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            s.addItems();
            cSema.release();
            }

        }


}
