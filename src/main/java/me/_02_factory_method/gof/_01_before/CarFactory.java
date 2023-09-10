package me._02_factory_method.gof._01_before;

public class CarFactory {

    public static Car orderCar(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("차 이름을 지어주세요.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }

        prepareFor(name);

        Car car = new Car();
        car.setName(name);

        // coloring
        if (name.equalsIgnoreCase("young")) {
            car.setColor("yellow");
        } else {
            car.setColor("black");
        }

        sendEmailTo(email, car);
        return car;
    }

    private static void sendEmailTo(String email, Car car) {
        System.out.println(car.getName() + " 다 만들었습니다.");
    }

    private static void prepareFor(String name) {
        System.out.println(name + " 차 만들 준비 중");
    }
}
