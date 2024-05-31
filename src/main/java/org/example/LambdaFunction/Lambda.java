package org.example.LambdaFunction;

import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Lambda {
    public static void main(String[] args) {

//        Printable lambdaPrintable = (suffix) -> {
//            System.out.println("Ths is here");
//            return "Meow"+suffix;
//        };
//        printThing(lambdaPrintable);


//        MyInternImp myInternImp = new MyInternImp();
//        myInternImp.sayHello();

        MyInter myInter = new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("hello");
            }
        };

        //using our interfaca using with lambda
        MyInter myInter1= ()->{
            System.out.println("Say Hello");
        };

        myInter1.sayHello();

        MyInter myInter2 = () -> System.out.println("Integer on the role");


        List<Integer> integerList = Arrays.asList(2,4,5,6,7);

        Consumer<Integer> consumer = n -> System.out.println(n);

        integerList.forEach(n -> System.out.println(n));
    }



//    public static void printThing(Printable thing){
//        thing.print("!");
//    }
}
