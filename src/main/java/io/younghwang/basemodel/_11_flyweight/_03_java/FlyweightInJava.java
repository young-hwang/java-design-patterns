package io.younghwang.basemodel._11_flyweight._03_java;

public class FlyweightInJava {
    public static void main(String[] args) {
        Integer integer = Integer.valueOf(10000);
        Integer integer2 = Integer.valueOf(10000);
        System.out.println(integer.equals(integer2));
    }
}