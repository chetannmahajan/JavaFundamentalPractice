package org.example;

public class Cat extends Animal{

    String catFoodPreference;

    public Cat(){

    }
    public Cat(int age, String name, String catFoodPreference){
        super(age, name);
        this.catFoodPreference = catFoodPreference;
    }

    @Override
    public void makeNoise(){
        super.makeNoise();
        System.out.println("Meow Meow");
    }

    public void eat(){
        System.out.println("chak chak chak chak");
    }
}
