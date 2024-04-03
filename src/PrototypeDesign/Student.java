package PrototypeDesign;

public class Student implements Prototype<Student> {
    int age;
    String name;
    String Batch;

    private int marks;


    Student(){

    }

    Student(Student s){
        this.name = new StringBuilder(s.name).toString();
        this.Batch = new StringBuilder(s.Batch).toString();
        this.age = s.age;
        this.marks = s.getMarks();
    }



    public Student copy(){
        Student s1 = new Student(this);

        return s1;
    }

    public int getMarks() {
        return marks;
    }
}
