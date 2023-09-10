package me._02_factory_method.gof._01_before;

public class Client {
    public static void main(String[] args) {
        Car youngCar = CarFactory.orderCar("young", "email@gmail.com");
        System.out.println(youngCar);
        Car ykculCar = CarFactory.orderCar("ykcul", "ykcul02@gmail.com");
        System.out.println(ykculCar);
    }
}
