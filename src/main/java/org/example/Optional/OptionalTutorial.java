package org.example.Optional;

import java.util.Optional;

public class OptionalTutorial {

    public static void main(String[] args) {
        Optional<Cat> optionalCatMyCat = findCatByName("Fred");
        System.out.println(optionalCatMyCat.get().getAge());
    }

    public static Optional<Cat> findCatByName(String name){
       Cat cat = new Cat(name, 3);
       return Optional.ofNullable(cat);
    }

}
