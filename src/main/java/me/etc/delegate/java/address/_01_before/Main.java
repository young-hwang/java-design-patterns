package me.etc.delegate.java.address._01_before;

import java.io.IOException;
import java.util.Enumeration;

public class Main {
    public static void main(String[] args) throws IOException {
        AddressFile addressFile = new AddressFile("UserInfo.txt");
        addressFile.getDatabase().set("Hwang", "hwang@gmail.com");
        addressFile.getDatabase().set("Young", "young@gmail.com");
        addressFile.getDatabase().set("home", "home@gmail.com");
        addressFile.getDatabase().update();

        Enumeration names = addressFile.names();
        while (names.hasMoreElements()) {
            String name = (String) names.nextElement();
            String email = addressFile.getDatabase().get(name);
            System.out.println(name + " " + email);
        }
    }
}
