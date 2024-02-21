package IntroToThreads;

public class PrintingNumber implements Runnable{

    private int num;
    @Override
    public void run() {
        System.out.println("ABCD");

        System.out.println("Number printing "+ num +" " +Thread.currentThread().getName());
    }

    PrintingNumber(int num){
        this.num=num;
    }

}
