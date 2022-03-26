package CarClasses;

public class Coupe extends Car{

    public Coupe() {
        setDescription(" Hello! I am coupe car");
    }
    public int cost() {
        System.out.println("Cost of coupe: 105$ ");
        return 105;
    }
}
