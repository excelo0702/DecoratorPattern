import CarClasses.Car;
import CarClasses.Sedan;

public class CarSimulator {
    public static void main(String[] args){
        Car sedan = new Sedan();
        sedan.cost();

        System.out.println("\nHey!! Can you please install refrigerator and healthMonitor\n");
        sedan.setHealthMonitor(true);
        sedan.setRefrigerator(true);
        sedan.cost();

        //Please add other classes method definition

        //this is a better approach than previous ones. But in future when we have more features to add
        // we need to make changes in Car class. Here we are violating our first design principle.
        // Thats why this is also not the way to go

    }
}
