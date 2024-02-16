package IntroToThreads;

class main {
    public static void main(String[] args) {
//        HelloWorldPrinter hp = new HelloWorldPrinter();

//        hp.run();
//        Thread t = new Thread(hp);
//        t.start();
        System.out.println("Current Thread: "+ Thread.currentThread().getName());

        for(int i=0;i<100;i++){
            PrintingNumber p = new PrintingNumber(i);
            Thread t2 = new Thread(p);
            t2.start();
        }
    }
}
