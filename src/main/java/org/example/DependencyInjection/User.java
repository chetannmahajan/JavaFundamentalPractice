package org.example.DependencyInjection;

public class User {

    Database database;

    public User(Database database){
        this.database = database;
    }

    public void add(String data){
        database.persists(data);
    }
}
