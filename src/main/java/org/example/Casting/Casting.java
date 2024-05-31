package org.example.Casting;

public class Casting {

    public static void main(String[] args) {

        Animal myAnimal = new Dog(); //Upcasting taking place automatically it is upcasting dog to Animal
        doAnimalStuff(myAnimal);
        Animal myAnimal1 = new Cat();
        doAnimalStuff(myAnimal1);
    }

    public static void doAnimalStuff(Animal animal){
        animal.makeNoise();

        if(animal instanceof Dog) { //checks if obejct in insatance of dog or cat. //if you don't check then it will throuw an error.
            Dog myDog = (Dog) animal; //DownCasting in animal object to myDog method.
            myDog.growl();
        }
    }

}
