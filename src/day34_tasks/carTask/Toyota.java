package day34_tasks.carTask;

public class Toyota extends Car {

    public Toyota(String model, int year, double price, String color) {
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
}
