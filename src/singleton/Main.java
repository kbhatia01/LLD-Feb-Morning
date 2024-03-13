package singleton;

public class Main {
    public static void main(String[] args) {
        dbconn d1 = dbconn.getInstance();
        dbconn d2 = dbconn.getInstance();
        d1.increment_c();

        System.out.println(d2.getC());
        System.out.println(d1.getC());

    }
}
