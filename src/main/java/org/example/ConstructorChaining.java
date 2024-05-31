package org.example;

public class ConstructorChaining extends demo{
    //Calling constructor from another constructor
    //this() and super()
    //this should be the first call in the constructor
    public ConstructorChaining(){
        this(5); //this means calling current class we are in that class's constructor.
        System.out.println("This is default constructor");
    }

    public ConstructorChaining(int i){
        this("chetan");
        System.out.println("This is int type constructor");
    }

    public ConstructorChaining(String string){
        super(); //calling parent constructor.
        System.out.println("This is string type constructor.");
    }

    public static void main(String[] args) {
        ConstructorChaining cc = new ConstructorChaining();
    }
}
