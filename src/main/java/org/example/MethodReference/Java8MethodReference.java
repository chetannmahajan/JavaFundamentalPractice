package org.example.MethodReference;

public class Java8MethodReference {

    public static void main(String[] args) {

        //using lambda expression
        AbcInterface abcInterface = x -> (x*x);
        System.out.println(abcInterface.operation(5));

        //using method reference
        AbcInterface abcInterface1 = Java8MethodReference :: square; //this is method referencing
        System.out.println(abcInterface1.operation(5));

        //you can call non static method as well
        Java8MethodReference obj = new Java8MethodReference();
        AbcInterface abcInterface2 = obj :: makeCube;
        System.out.println(abcInterface2.operation(3));

        }

        public static int square(int a){
        return a*a;
        }

        public int makeCube(int a){
        return a*a*a;
        }
}
