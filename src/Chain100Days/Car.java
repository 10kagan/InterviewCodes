package Chain100Days;

public class Car extends Vehicle {

    public Car (String brand){
        super(brand);
    }

    @Override
    public void start(){
        System.out.println("Car is starting with an engine");
    }
}

