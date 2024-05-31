package org.example.coupling.tight;

public class Travel {
    public void start(){
        /*Bus bus = new Bus();
        bus.start();*/

        Train train = new Train();
        train.go();
    }
}
