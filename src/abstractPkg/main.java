package abstractPkg;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class main {
    public static void main(String[] args) {

//        Animal a = new Animal(); Abstract class cant create object;

        Dog d =  new Dog();
        System.out.println(Dog.y +" "+ d.z); // y- 11, z=1
        Dog d2 =  new Dog();
        System.out.println("in 2:" + Dog.y +' '+ d2.z); //12, z=1

        Dog.test();

        d.doSomething();



        List<Integer> ll = new ArrayList<>();
        ll.add(10);
        ll.add(10);
        ll.add(10);
        ll.add(10);



    }
}
