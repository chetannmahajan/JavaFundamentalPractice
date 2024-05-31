package org.example.DependencyInjection;

public class Main {
    public static void main(String[] args) {
        User user = new User(new MySqlDatabase());
        user.add("12345");
    }
}
