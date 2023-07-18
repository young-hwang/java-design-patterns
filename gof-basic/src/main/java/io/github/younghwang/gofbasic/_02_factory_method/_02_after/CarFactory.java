package io.github.younghwang.gofbasic._02_factory_method._02_after;

public interface CarFactory {
    default Car orderCar(String name, String email) {
        validate(name, email);
        prepareFor(name);
        Car car = createCar(name);
        sendEmailTo(email, car);
        return car;
    }

    Car createCar(String name);

    default void sendEmailTo(String email, Car car) {
        System.out.println(car.getName() + " 다 만들었습니다.");
    }

    default void prepareFor(String name) {
        System.out.println(name + " 차 만들 준비 중");
    }

    default void validate(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("차 이름을 지어주세요.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }
    }
}
