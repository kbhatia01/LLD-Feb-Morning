package IntroToThreads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class main {
    public static void main(String[] args) {
//        HelloWorldPrinter hp = new HelloWorldPrinter();

//        hp.run();
//        Thread t = new Thread(hp);
//        t.start();
        System.out.println("Current Thread: "+ Thread.currentThread().getName());
        ExecutorService es = Executors.newCachedThreadPool();
        for(int i=0;i<1000000;i++){
            PrintingNumber p = new PrintingNumber(i);
            Thread t = new Thread(p);
            t.start();
//            es.submit(p);

        }
    }
}
