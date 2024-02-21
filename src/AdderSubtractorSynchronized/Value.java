package AdderSubtractorSynchronized;

public class Value {
    int i = 0;

    synchronized public void increment(){
        this.i+=1;
    }

    synchronized public void decrement(){
        this.i-=1;
    }
}
