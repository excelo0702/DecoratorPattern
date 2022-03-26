package CarClasses;

public class Hatchback extends Car{

    public Hatchback(){
        setDescription(" Hello! I am Hatchback car");
    }

    @Override
    public int cost() {
        System.out.println("Cost of hatchback: 70$ ");
        return 70;
    }
}
