package CarClasses;

public class Sedan extends Car {

    public Sedan(){
        setDescription(" Hello! I am sedan car");
    }

    @Override
    public int cost() {
        System.out.println("Cost of sedan: 85$ ");
        return 85;
    }
}
