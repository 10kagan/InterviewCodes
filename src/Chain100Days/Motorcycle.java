package Chain100Days;

public class Motorcycle extends Vehicle {

    public Motorcycle(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println("Motorcycle is starting with a kick or button");
    }

    public static void main(String[] args) {

        Vehicle car = new Car("Toyota");
        Vehicle bike = new Motorcycle("Honda");

        car.showBrand();
        car.start();

        bike.showBrand();
        bike.start();
    }
}

// Create an abstract class and extend it