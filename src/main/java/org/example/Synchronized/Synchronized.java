package org.example.Synchronized;

public class Synchronized {

    public static void main(String[] args) {
        Counter c = new Counter();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1; i<=1000; i++){
                    c.increment();
                }
            }
        });

        t1.start();


        System.out.println("Counter value:"+c.count);
    }
}
