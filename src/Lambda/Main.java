package Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//        Way 1
        Runnable l = new Lambda();
        Thread t = new Thread(l);
        t.start();

//        Way 2: as lamda function
        Runnable r = ()->{
            System.out.println("In lambda expression");
        };
        Thread t2 = new Thread(r);
        t2.start();

        List<Integer> listx = new ArrayList<>();

        listx.add(11);
        listx.add(16);
        listx.add(4);
        listx.add(9);
        listx.add(-1);

        // TERMINAL : Terminal
        // INTERMIDIATORY OPN: Filter, MAP

        Stream<Integer> s1 = listx.stream();

        s1.forEach((elm)->{System.out.println(elm);});

        Stream<Integer> s2 = listx.stream();

        s2.filter((elm)->{
            System.out.println("Filtering data "+ elm);
            return elm%2==0;
        }).forEach((elm)->{
            System.out.println("Printing: " + elm);
        });

        for(int i = 0; i < listx.size(); i++) {
            System.out.println("Filtering data "+ listx.get(i));
            if(listx.get(i)%2==0){
                System.out.println("Printing: " + listx.get(i));
            }

        }

        Stream<Integer> s3 = listx.stream();

        System.out.println("------ STREAM 3 ------");
        s3.filter((elm)->{
            System.out.println("Filtering data "+ elm);
            return elm%2==0;
        }).sorted((obj1, obj2)->{
            System.out.println("SortingData: "+ obj1 +" "+ obj2);
            if(obj1<obj2) {
                return -1;
            } else if (obj1>obj2) {
                return 1;
            }
            return 0;
        }).forEach((elm)->{
            System.out.println("Printing: " + elm);
        });

    // MAPS: Manupulate the data
        Stream<Integer> s4 = listx.stream();
        s4.map((elm)->{
            System.out.println("adding 5 to data "+ elm);

            return elm +5;
        }).filter((elm)->{
            System.out.println("Filtering data "+ elm);
            return elm%2==0;
        }).sorted((obj1, obj2)->{
            System.out.println("SortingData: "+ obj1 +" "+ obj2);
            if(obj1<obj2) {
                return -1;
            } else if (obj1>obj2) {
                return 1;
            }
            return 0;
        }).map((elm)->{
            return elm + " HI";
        }).forEach((elm)->{
            System.out.println("Printing: " + elm);
        });

        // REDUCE:
        Stream<Integer> s5 = listx.stream();
        Optional<Integer> a = s5.filter((elm)->{
            System.out.println("Filtering data "+ elm);
            return elm%2==0;
        }).reduce((oldMax,num2)->Math.max(num2, oldMax));

        if(a.isPresent()){
            System.out.println(a.get());
        }
        Stream<Integer> s6 = listx.stream();
        int ans = s6.filter((elm)->{
            System.out.println("Filtering data "+ elm);
            return elm%2==0;
        }).reduce((oldMax,num2)->Math.max(num2, oldMax)).orElse(-1);



        Stream<Integer> s10 = listx.stream();
        s10.filter((elm)->{
            System.out.println("Filtering data "+ elm);
            return elm%2==0;
        }).forEach(System.out::println);


        Stream<Integer> s11 = listx.stream();
        List<Integer> az = s11.filter((elm)->{
            System.out.println("Filtering data "+ elm);
            return elm%2==0;
        }).collect(Collectors.toList());

        for(Integer aa: az){
            System.out.println(aa);
        }


        // HOMEWORK:
//        TRY OTHER REDUCE OPREATIONS:
//        LIKE FINDING AVG WITH REDUCE, FInding min using function reference
    }
}
