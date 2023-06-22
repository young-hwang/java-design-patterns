package io.younghwang.basemodel._03_abstract_factory._02_after;

public class Client {
    public static void main(String[] args) {
        MyCarFactory myCarFactory = new MyCarFactory();
        MyCarPartsFactory myCarPartsFactory = new MyCarPartsFactory();
        myCarFactory.setPartsFactory(myCarPartsFactory);
        Car car = myCarFactory.createCar();
        System.out.println(car);
    }
}
