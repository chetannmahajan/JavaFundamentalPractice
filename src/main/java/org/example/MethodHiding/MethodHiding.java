package org.example.MethodHiding;

public class MethodHiding {

    public static void main(String[] args) {
        Car myCar = new BMW();
        myCar.start();

        String name = "chetan";
        System.out.println(name.toUpperCase().trim());

    }

}
