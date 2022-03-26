package Decorators;

import CarClasses.Car;

public class HealthMonitor extends FeatureDecorator{
    public HealthMonitor(Car car) {
        super(car);
    }

    @Override
    public int cost() {
        System.out.println("Cost of HealthMonitor: 3$ ");
        return car.cost() + 3;
    }
}
