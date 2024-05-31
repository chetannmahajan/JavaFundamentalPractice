package org.example.singleton;

public interface Driver {

    public static void main(String[] args) {


        System.out.println(TVSet.getInstanceOfTv());
        System.out.println(TVSet.getInstanceOfTv());
    }

//    public static void main(String[] args) {
//
//        System.out.println(TVSet.getTVSetInstance());
//        System.out.println(TVSet.getTVSetInstance());
//    }
}
