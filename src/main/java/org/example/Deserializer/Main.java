package org.example.Deserializer;

import org.example.Serializer.User;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Steps to Deserialize
        // 1. Declare your object (don't instantiate)
        // 2. Your class should implement Serializable interface
        // 3. add import java.io.Serializable;
        // 4. FileInputStream fileIn = new FileInputStream(file path);
        // 5. ObjectInputStream in = new ObjectInputStream(fileIn);
        // 6. objectNam = (Class) in.readObject();
        // 7. in.close(); fileIn.close();


        User user = null;

        FileInputStream fileInput = new FileInputStream("C:\\Users\\chetan_mahajan\\Desktop\\Practice\\UserInfo.ser");
        ObjectInputStream objectInput = new ObjectInputStream(fileInput);

        user = (User) objectInput.readObject();
        objectInput.close();
        fileInput.close();

        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();
    }
}
