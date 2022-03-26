import CarClasses.Car;
import CarClasses.Sedan;
import CarClasses.SedanWithRefrigerator;

public class CarSimulator {
    public static void main(String[] args){
        Car sedan = new Sedan();
        sedan.cost();

        //Please add description and mileage of Cars by your own.

        System.out.println("Hey Hakim!! Please install refrigerator in car");
        sedan = new SedanWithRefrigerator();
        sedan.cost();

        // Atleast we are able to install features dynamically, but if customer asks hakim to add healthMonitor too.
        // He has too create a new class SedanWithHealthMonitorWithRefrigertor to install them. That is not totally a way to go
        //because if hakim follows this approach, he has to create many classes. He obviously cant manage it.
    }
}
