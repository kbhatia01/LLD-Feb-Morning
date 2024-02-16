package inheritance;

public class C extends B{

    C(){
        super("abc");
        System.out.println("C called");
    }
    C(String s){
        this();
        System.out.println("c params called with value "+s);

    }

    B doSomething(){
        System.out.println("do something doSomething()");
        return new B("");
    }

    void doSomething(String s){
        System.out.println("do something doSomething(String s)");
    }

    void doSomething(String z, String k){
        System.out.println("do something doSomething(String z, String k)");
    }

    void doSomething(int z, String k){
        System.out.println("do something doSomething(int z, String k)");
    }

    void doSomething(String z, int k){
        System.out.println("do something in c  doSomething(String z, int k)");
    }
}
