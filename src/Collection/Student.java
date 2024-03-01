package Collection;

public class Student implements Comparable<Student>{
    int id;
    int age;
    String name;
    int psp;

    Student(int id, int age, String name, int psp){
        this.id = id;
        this.name= name;
        this.age = age;
        this.psp = psp;
    }

    @Override
    public int compareTo(Student other) {
        // this object come first return -1\
        // other first return 1
        if(this.id==other.id){
            return 0;
        } else if (this.id<other.id) {
            return -1;
        }
        return 1;
    }
}
