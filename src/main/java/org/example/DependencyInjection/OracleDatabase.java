package org.example.DependencyInjection;

public class OracleDatabase implements Database{

    public void persists(String data){
        System.out.println("Oracle hase persists some data:"+data);
    }
}
