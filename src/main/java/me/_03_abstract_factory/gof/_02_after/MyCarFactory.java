package me._03_abstract_factory.gof._02_after;

public class MyCarFactory extends DefaultCarFactory {
    private MyCarPartsFactory partsFactory;

    public void setPartsFactory(MyCarPartsFactory partsFactory) {
        this.partsFactory = partsFactory;
    }

    @Override
    public Car createCar() {
        Car myCar = new MyCar();
        myCar.setEngine(partsFactory.createEngine());
        myCar.setWheel(partsFactory.createWheel());
        return myCar;
    }
}
