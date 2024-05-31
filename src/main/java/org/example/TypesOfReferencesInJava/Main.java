package org.example.TypesOfReferencesInJava;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class Main {
    public static void main(String[] args) {
        //strongReferences();
        //weakReference();
        softReference();
        //phantomReference();
    }

    private static void strongReferences(){
        Employee emp = new Employee(1234,"Chetan"); //Strong reference
        emp = null;     // eligible for Garbage collector.
    }

    private static void weakReference(){
        Employee emp = new Employee(12345,"Rahul");
        WeakReference<Employee> weakReference = new WeakReference<Employee>(emp);
        System.out.println(weakReference.get());
        emp=null;
        System.gc();
        System.out.println(weakReference.get());
    }

    private static void softReference(){
        Employee emp = new Employee(12345,"Rahul");
        SoftReference<Employee> softReference = new SoftReference<Employee>(emp);
        System.out.println(softReference.get());
        emp = null;
        System.gc();
        System.out.println(softReference.get());
    }

    private static void phantomReference()  {
        Employee emp = new Employee(1441, "KK");
        ReferenceQueue<Employee> referenceQueue = new ReferenceQueue<Employee>();
        PhantomReference<Employee> phantomReference = new PhantomReference<Employee>(emp, referenceQueue);
        System.out.println("Phantom reference deleted:");
        System.out.println(phantomReference.get());
    }
}
