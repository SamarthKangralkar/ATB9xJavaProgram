package Nov.ex12112024_Abstraction_Interface;

public class Lab_Abstract1 {

    public static void main(String[] args) {
        Car c = new Car();
        c.bike_amount();
        c.car_amount();
        c.startbike();
        c.startcar();
    }
}
abstract class Engine{
    abstract void startcar();
    abstract void startbike();
    abstract void car_amount();
    abstract  void bike_amount();
}

class Car extends Engine{

    @Override
    void startcar() {
        System.out.println("Start Starting car");
    }

    @Override
    void startbike() {
        System.out.println("Start Starting bike");

    }

    @Override
    void car_amount() {
        System.out.println("Car amount");

    }

    @Override
    void bike_amount() {
        System.out.println("Bike price");

    }
}


