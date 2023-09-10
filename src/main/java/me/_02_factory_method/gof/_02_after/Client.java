package me._02_factory_method.gof._02_after;

public class Client {
    public static void main(String[] args) {
        CarFactory yellowCarFactory = new YellowCarFactory();
        Car youngCar = yellowCarFactory.orderCar("young", "email@gmail.com");
        System.out.println(youngCar);

        CarFactory blackCarFactory = new BlackCarFactory();
        Car ykculCar = blackCarFactory.orderCar("ykcul", "ykcul02@gmail.com");
        System.out.println(ykculCar);
    }
}
