package Decorators;

import CarClasses.Car;

public class Alexa extends FeatureDecorator{
    public Alexa(Car car) {
        super(car);
    }

    @Override
    public int cost() {
        System.out.println("Cost of Alexa: 2$ ");
        return car.cost() + 2;
    }
}
