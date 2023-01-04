package abstractconcept;
abstract class Vehicle{
    abstract void engine();
}
class Car extends Vehicle
{
    @Override
    void engine() {
        System.out.println("Car has a good engine");
    }
}
class Truck extends Vehicle
{
    @Override
    void engine() {
        System.out.println("Truck has a bad engine");
    }
}
public class VehicleTest {
    public static void main(String[] args) {
        Vehicle v=new Car();
        v.engine();
        Vehicle v1=new Truck();
        v1.engine();
    }
}

