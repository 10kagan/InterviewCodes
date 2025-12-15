package Chain100Days;

public abstract class Vehicle {

    protected String brand;

    public Vehicle (String brand){
        this.brand = brand;
    }

    public void showBrand(){
        System.out.println("Brand: " + brand);
    }

    public abstract void start();
}

