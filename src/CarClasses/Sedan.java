package CarClasses;

public class Sedan extends Car {

    public Sedan(){
        setDescription(" Hello! I am sedan car");
        setMileage("mileage is 23kmpl");
        setAlexa(false);
        setHealthMonitor(false);
        setRefrigerator(false);
        setOwlCam(false);
        setTireSafetyMonitor(false);
    }

    @Override
    public void cost() {
        int costOfCar = 85;
        if(getOwlCam()){
            costOfCar+=3;
        }
        if(getAlexa()){
            costOfCar+=2;
        }
        if(getHealthMonitor()){
            costOfCar+=5;
        }
        if(getRefrigerator()){
            costOfCar+=7;
        }
        if(getTireSafetyMonitor()){
            costOfCar+=2;
        }
        System.out.println("Total Cost is: "+costOfCar);
    }
}
