package ProducerConsumerSemaphore;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {
    public int maxShelf;
    private Deque<Object> items;

    Store(int maxShelf){
        this.maxShelf = maxShelf;
        items = new ConcurrentLinkedDeque<>();
    }

    public Deque<Object> getItems(){
        return this.items;
    }

    public boolean canAppend(){
        return this.items.size() < maxShelf;
    }

    public boolean canConsume(){
        return this.items.size() > 0;
    }

    public void addItems(){
        this.items.add(new Object());
        System.out.println("Producer added element, list size: "+ this.items.size());
    }

    public void buy(){

        this.items.remove();
        System.out.println("Consumer removed element,  list size:"+ this.items.size());

    }




}
