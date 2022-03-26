package CarClasses;

public class Sedan extends Car {

    public Sedan(){
        setDescription(" Hello! I am sedan car");
        setMileage("mileage is 23kmpl");
    }

    @Override
    public void cost() {
        System.out.println("Cost of sedan car is 85$");
    }
}
