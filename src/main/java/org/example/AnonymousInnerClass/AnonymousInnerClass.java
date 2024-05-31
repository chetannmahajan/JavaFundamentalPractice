package org.example.AnonymousInnerClass;

public class AnonymousInnerClass {

    public static void main(String[] args) {
        Animal myAnimal = new Animal(){
            @Override
            public void makeNoise(){
                System.out.println("I'm an anonymous Inner class");
            }
        };

        myAnimal.makeNoise();

        Runnable myAnonymousRunnable = new Runnable() { //Runnable is an interface
                                                        //it is used to create multithreaded program
            @Override
            public void run() {
                System.out.println("I'm an anonymous Runnable.");
            }
        };

        myAnonymousRunnable.run();
    }


}
