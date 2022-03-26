package Decorators;

import CarClasses.Car;

public class Refrigerator extends FeatureDecorator{
    public Refrigerator(Car car) {
        super(car);
    }

    @Override
    public int cost() {
        System.out.println("Cost of refrigerator: 7$ ");
        return car.cost() + 7;
    }
}
