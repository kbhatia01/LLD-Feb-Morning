package mergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
    private List<Integer> arrayToSort;
    private ExecutorService es;

    Sorter(List<Integer> arr, ExecutorService es){
        this.arrayToSort =arr;
        this.es = es;
    }


    public List<Integer> call() throws Exception {
       if(arrayToSort.size()<=1){
           return arrayToSort;
       }

       // divide:
        int size= arrayToSort.size();
        int mid = size/2;
        List<Integer> leftArray = new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();

        for (int i=0;i<mid;i++){
            leftArray.add(arrayToSort.get(i));
        }

        for (int i=mid;i<size;i++){
            rightArray.add(arrayToSort.get(i));
        }

        Sorter s1 = new Sorter(leftArray, es);
        Sorter s2 = new Sorter(rightArray, es);
        Future<List<Integer>> futureLeftArray = es.submit(s1);
        Future<List<Integer>> futureRightArray  = es.submit(s2);

        // wait for the response
        List<Integer> leftSortedArray = futureLeftArray.get();
        List<Integer> rightSortedArray = futureRightArray.get();

        // merge:
        int i=0;
        int j=0;

        List<Integer> sortedArray = new ArrayList<>();

        while (i<leftSortedArray.size() && j<rightSortedArray.size()){
            if(leftSortedArray.get(i)<=rightSortedArray.get(j)){
                sortedArray.add(leftSortedArray.get(i));
                i++;
            }else {
                sortedArray.add(rightSortedArray.get(j));
                j++;
            }
        }

        while (i<leftSortedArray.size()){
            sortedArray.add(leftSortedArray.get(i));
            i++;
        }

        while (j<rightSortedArray.size()){
            sortedArray.add(rightSortedArray.get(j));
            j++;
        }
        return sortedArray;


    }
}

