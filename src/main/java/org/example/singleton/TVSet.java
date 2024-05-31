package org.example.singleton;

public class TVSet {

    public static TVSet tvSetIntace = null;

    private TVSet(){

    }

    public static TVSet getInstanceOfTv(){
        if(tvSetIntace == null){
            tvSetIntace = new TVSet();
        }
        return tvSetIntace;
    }



//    static volatile TVSet TVSetInstance = null;
//    private TVSet(){
//
//    }
//
//    public static TVSet getTVSetInstance(){
//        if(TVSetInstance == null){
//            TVSetInstance = new TVSet();
//        }
//        return TVSetInstance;
//    }
}
