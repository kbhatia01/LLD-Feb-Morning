package mergeSort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> a = List.of(8,1,7,5,6,4,3,9);

        ExecutorService es = Executors.newCachedThreadPool();
        Sorter s = new Sorter(a, es);

        Future<List<Integer>> ans = es.submit(s);
        List<Integer> finalANs = ans.get();

        for (Integer finalAN : finalANs) {
            System.out.println(finalAN);
        }


    }
}
