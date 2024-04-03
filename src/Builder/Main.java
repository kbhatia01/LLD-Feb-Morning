package Builder;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // BASIC WAY:
//        Builder b = new Builder();
//        b.setId(1);
//        b.setPsp(101.00);
//        Student s = b.build();


        // CHANING
//        Student s = new Builder()
//                .setId(10)
//                .setPsp(101)
//                .build();


        Student.Builder b = new Student.Builder();
        b.setId(10);
        b.build();
        Student s = Student.getInstance().setId(1)
                    .setName("abc")
                    .setPsp(100)
                    .build();




        System.out.println("debug");

    }
}
