package abstractPkg;

public class Dog extends mammal{

    public static int y =10;
    int z =0;
    final int m = 15;
    public void run() {
        System.out.println("running...");
    }

    void doSomething(){
        System.out.println(y);
//        m+=1; final variable can't be assigned value or change the value..

        System.out.println(m*10);
    }

    static void test(){
        System.out.println(y);

//        System.out.println(z); non static members can't be accessed in static members..


    }

//    void eat(){ Parent method is final, can't be overridden by child..
//        System.out.println("abc");
//    }

    Dog(){
        y+=1;
        z+=1;
    }
}
