package CarClasses;

public class Hatchback extends Car{

    public Hatchback(){
        setDescription(" Hello! I am Hatchback car");
        setMileage("mileage is 19kmpl");
    }

    @Override
    public void cost() {
        System.out.println("Cost of hatchback car is 70$");
    }
}
