package interfaces;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<runner> runningAnimals = new ArrayList();
        runner d = new Dog();
        mammal m = new mammal();
        Bat b = new Bat();
        runningAnimals.add(d);
        d.run();

//        runningAnimals.add(m);
//        runningAnimals.add(b);

        for (runner anm:runningAnimals) {
            anm.run();
        }

    }
}
