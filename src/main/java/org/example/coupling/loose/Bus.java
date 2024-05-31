package org.example.coupling.loose;

public class Bus implements Transport{

    @Override
    public void start(){
        System.out.println("Bus trip started..");
    }
}
