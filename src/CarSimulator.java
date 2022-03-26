import CarClasses.Car;
import CarClasses.Sedan;
import Decorators.Alexa;
import Decorators.Refrigerator;

public class CarSimulator {
    public static void main(String[] args){
        Car sedan = new Sedan();
        System.out.println("Total Cost: "+sedan.cost()+"\n\n");

        System.out.println("Please Add refrigerator \n");
        sedan = new Refrigerator(sedan);
        System.out.println("Total Cost: "+sedan.cost()+"\n\n");

        System.out.println("Lets Add Alexa too\n");
        sedan = new Alexa(sedan);
        System.out.println("Total Cost: "+sedan.cost()+"\n\n");
    }
}
