package io.younghwang.basemodel._03_abstract_factory._01_before;

public class MyCarFactory extends DefaultCarFactory {
    @Override
    public Car createCar() {
        Car myCar = new MyCar();
        myCar.setEngine(new MyEngine());
        myCar.setWheel(new MyWheel());
        return myCar;
    }
}
