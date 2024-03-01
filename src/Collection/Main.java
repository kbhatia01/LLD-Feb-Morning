package Collection;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Set<Integer> s1 = new TreeSet<>();
        s1.add(10);
        s1.add(1);
        s1.add(15);
        s1.add(-1);
        s1.add(10);
        s1.add(22);
        s1.add(4);


        for (Integer x: s1) {
            System.out.println(x);
        }

        Set<Student> s2 = new TreeSet<>();
        for(int i=0;i<5;i++){
            s2.add(new Student(i, i*10, "abc"+i, i*12));
        }

        for (Student x: s2) {
            System.out.println(x.id);
        }

        Queue<Student> q = new PriorityQueue<>(new StudentPspComparator());
        for(int i=0;i<5;i++){
            q.add(new Student(i, i*10, "abc"+i, i*12));
        }

        while (!q.isEmpty()){
            System.out.println(q.peek().psp);
            q.poll();
        }

        List<Student> s = new ArrayList<>(List.of(
                new Student(1,10,"abc", 30),
                new Student(3,20,"abc1", 40),
                new Student(2,40,"abc2", 50)
        ));

        Collections.sort(s, new StudentPspComparator());

        for (Student x: s) {
            System.out.println(x.psp);
        }

        Comparator<Student> c = ((o1, o2) -> {
            if(o1.age== o2.age){
                return 0;
            } else if (o1.age< o2.age) {
                return -1;
            }
            return 1;
        });
        Collections.sort(s, c);

        for (Student x: s) {
            System.out.println(x.age);
        }
    }
}
