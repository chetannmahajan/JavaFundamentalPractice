package org.example.instanceOfKeyword;

public class Main {
    public static void main(String[] args) {

        Main obj = new Main();
        System.out.println(obj instanceof Main);
        //class, subClass or interface

        Eagle e = new Eagle();
        System.out.println(e instanceof Bird); //on subclass

        Dog myDog = new Dog();
        System.out.println(myDog instanceof Animal); //on interface

    }
}
