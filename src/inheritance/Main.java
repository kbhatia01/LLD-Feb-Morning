package inheritance;

public class Main {
    static void setPassword(User u){
        u.setPassword("mno");
    }
    public static void main(String[] args) {
        student s = new student();
        s.email="abc@gmail.com";
        s.setPassword("password");

        System.out.println(s);

        D d = new D("S");
        System.out.println(d);

//POLYMORPHISM:
        User s2 = new student();
//        s2.doSomething();
//        NOT ALLOWED WITH PARENT REFERENCE TO ACCESS CHILD'S THING...
        System.out.println(s2);
//        s2.psp = 10;

//        ALL USERS ARE NOT STUDENTS..
//        student s3 = new User();

        setPassword(new student());

        System.out.println(s2);


        // method overloading:

        C c = new C();
        c.doSomething("a");
        c.doSomething("a","b");
        c.doSomething(10,"abc");
        c.doSomething("abc", 10);

        D d1 = new D();
        d1.doSomething();
        d1.doSomething("abc",10);

    }



}
