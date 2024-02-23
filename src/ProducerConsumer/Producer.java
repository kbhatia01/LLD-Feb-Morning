package ProducerConsumer;

public class Producer implements Runnable{

    private Store s;

    Producer(Store s){
        this.s = s;
    }


    @Override
    public void run() {
        while(true){
            synchronized (s){
                if (s.canAppend()){
                    s.addItems();
                }
            }

        }

    }
}
