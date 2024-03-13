package singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class dbconn {
    private static dbconn instance = null;

    static Lock  l = new ReentrantLock();

    int c = 0;

    public int getC() {
        return c;
    }

    public void increment_c(){
        this.c+=1;
    }

    private dbconn(){

    }

    public static dbconn getInstance(){
        if(instance==null){

            l.lock();
            if(instance == null){
                instance = new dbconn();
            }
            l.unlock();
        }
        return instance;
    }
}
