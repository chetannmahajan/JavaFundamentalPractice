package org.example.LambdaFunction;

public class Cat implements Printable{

    @Override
    public String print(String s) {
        System.out.println("Meow");
        return "meow";
    }
}
