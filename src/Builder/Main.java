package Builder;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//        Builder b = new Builder();
//        b.setId(1);
//        b.setPsp(101.00);
//        Student s = b.build();

        Student s = new Builder()
                .setId(10)
                .setPsp(101)
                .build();



        System.out.println("debug");

    }
}
