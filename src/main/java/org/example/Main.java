package org.example;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Cat myCat = new Cat(3,"Tom", "Sting Fish");
        System.out.println(myCat.age+" "+myCat.name+" "+myCat.catFoodPreference);
        myCat.makeNoise();

        String name1 = new String("Hello");
        String name2 = new String("Hello");

        if(name1 == name2){
            System.out.println("Both the strings are equal");
        }else{
            System.out.println("Both the strings are not equal");
        }

        String name = "   Chetan ";
//        name = name.concat("Mahajan ");
//        name = name.toUpperCase();
//        name = name.trim();

        name = name.concat("Mahajan ").toUpperCase().trim();

        System.out.println("The String name is:"+name);

        Animal animal = new Animal();
        Cat cat = new Cat();

        A a = new A();
        B b = new B();
        a.method();
        b.method();
        a = b;
        a.method();


        LinkedList<String> list = new LinkedList<String>();
        list.add("a1");
        list.add("b1");
        System.out.print(list.getLast());
    }
}