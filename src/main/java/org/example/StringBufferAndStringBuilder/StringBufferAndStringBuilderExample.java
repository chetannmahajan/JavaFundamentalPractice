package org.example.StringBufferAndStringBuilder;

public class StringBufferAndStringBuilderExample {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Hello ");

        for(int i =0; i<100000; i++){
            sb.append("world");
        }

        System.out.println("Time taken by StringBuffer:"+(System.currentTimeMillis() - startTime));


        startTime = System.currentTimeMillis();
        StringBuilder sbd = new StringBuilder("Hello ");

        for(int i =0; i<100000; i++){
            sb.append("world");
        }

        System.out.println("Time taken by StringBuilder:"+(System.currentTimeMillis() - startTime));

    }
}
