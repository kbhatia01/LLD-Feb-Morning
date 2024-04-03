package PrototypeDesign;

public class Main {
    public static void fillRegistry(StudentRegistry sr1){
        IStudent i1 = new IStudent();
        sr1.Register("IntelligentStuent", i1);

        Student s = new Student();
        sr1.Register("Student", s);

    }

    public static void main(String[] args) {


        StudentRegistry sr = new StudentRegistry();
        fillRegistry(sr);

        Student s1 = new Student();
        s1.name = "abc";
        s1.Batch = "MNO";
        s1.age = 10;

        Student s2 = s1.copy();

        System.out.println("DEBUG");
        IStudent i1 = new IStudent();
        i1.name = "abc";
        i1.Batch = "MNO";
        i1.age = 10;
        i1.psp = 20;

        IStudent i2 = i1.copy();


        // using registry

        Student s = sr.get("Student");

    }
}
