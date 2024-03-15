package Builder;

import java.util.InvalidPropertiesFormatException;

public class Student {

    int id;
    String name;

    double psp;

    int gradYear;


//    Student(int id, String name, .....){
//        // validate
//        // throw error..
//    }

    Student(Builder b)  {

        this.id = b.getId();
        this.name = b.getName();
        this.psp = b.getPsp();
        this.gradYear = b.getGradYear();
    }

}
