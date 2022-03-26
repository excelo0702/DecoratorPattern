package Decorators;

import CarClasses.Car;

public abstract class FeatureDecorator extends Car {

    Car car;

    public FeatureDecorator(Car car) {
        this.car = car;
    }

    @Override
    public abstract int cost();
}
