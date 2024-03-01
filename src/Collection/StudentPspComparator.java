package Collection;

import java.util.*;

public class StudentPspComparator implements Comparator<Student> {

    public int compare(Student o1, Student other){
//        System.out.println("Using comparator");
        if(o1.psp==other.psp){
            return 0;
        } else if (o1.psp<other.psp) {
            return -1;
        }
        return 1;
    }

}
