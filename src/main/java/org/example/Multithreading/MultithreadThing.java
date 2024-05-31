package org.example.Multithreading;

public class MultithreadThing extends Thread{

    private int thredNumber;

    public MultithreadThing(int threadNumber){
        this.thredNumber = threadNumber;
    }

    @Override
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println(i + " from thread "+ thredNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
