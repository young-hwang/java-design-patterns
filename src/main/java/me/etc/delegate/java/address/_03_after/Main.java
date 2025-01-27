package me.etc.delegate.java.address._03_after;

import java.io.IOException;
import java.util.Enumeration;

public class Main {
    public static void main(String[] args) throws IOException {
        AddressFile addressFile = new AddressFile("UserInfo.txt");
        addressFile.set("Hwang", "hwang@gmail.com");
        addressFile.set("Young", "young@gmail.com");
        addressFile.set("home", "home@gmail.com");
        addressFile.update();

        Enumeration names = addressFile.names();
        while (names.hasMoreElements()) {
            String name = (String) names.nextElement();
            String email = addressFile.get(name);
            System.out.println(name + " " + email);
        }
    }
}
