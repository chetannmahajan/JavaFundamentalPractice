package org.example.Serializer;

import javax.print.MultiDocPrintService;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws IOException {
        User user = new User();
        user.name = "Bro";
        user.password = "I<3Pizza";

        user.sayHello();

//        Steps to Serialize
//        1. Your object class should implement Serializable interface
//        2. add import java.io.Serializable;
//        3. FileOutputStream fileOut = new FileOutputStream(file path)
//        4. ObjectOutputStream out = new ObjectOutputStream(fileOut);
//        5. out.writeObject(objectName)
//        6. out.close();B fileOut.close();

        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("Object info saved.");
    }

}
