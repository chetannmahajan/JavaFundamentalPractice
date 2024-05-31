package org.example.Varargs;

public class Calculate {

    public int add(int ...n){ //{4,5,6,7,8}
        int sum = 0;
        for(int i: n){
            sum += i;
        }

        return sum;
    }

}
