package org.example.Multithreading;

public class Multithreading {

    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            MultithreadThing mything = new MultithreadThing(i);
            mything.start();
        }
    }

}
