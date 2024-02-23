package ProducerConsumer;

public class Consumer implements Runnable{

    private Store s;

    Consumer(Store s){
        this.s = s;
    }


    @Override
    public void run() {
        while (true){
            synchronized (s) {
                if (s.canConsume()) {
                    s.buy();
                }
            }
        }
    }
}
