package day34_tasks.carTask;

public class Audi extends Car implements AutoPark{

    public Audi(String model, int year, double price, String color) {
        super(model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Turn the ignition key to start " + getMake() + getModel());
    }

    @Override
    public void drive() {
        System.out.println(getMake() + getModel() + " is driving");

    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + getModel() + " is self parking");

    }
}
