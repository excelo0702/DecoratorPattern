package CarClasses;

public class Coupe extends Car{

    public Coupe() {
        setDescription(" Hello! I am coupe car");
        setMileage("mileage is 29kmpl");
    }

    @Override
    public void cost() {
        System.out.println("Cost of sedan car is 105$");
    }
}
