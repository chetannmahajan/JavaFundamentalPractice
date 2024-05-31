package org.example.DependencyInjection;

public class MySqlDatabase implements Database{

    public void persists(String data){
        System.out.println("MySql persists some data:"+data);
    }
}
