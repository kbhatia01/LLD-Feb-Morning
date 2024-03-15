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

    private Student(Builder b) {

        this.id = b.getId();
        this.name = b.getName();
        this.psp = b.getPsp();
        this.gradYear = b.getGradYear();
    }


    public static Builder getInstance() {
        return new Builder();
    }


    static class Builder {

        int id;
        String name;

        double psp;

        int gradYear;

        public int getGradYear() {
            return gradYear;
        }

        public double getPsp() {
            return psp;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Student build() {
            if (this.psp > 100) {
                throw new RuntimeException("Not allowed");
            }
            return new Student(this);
        }

    }
}
