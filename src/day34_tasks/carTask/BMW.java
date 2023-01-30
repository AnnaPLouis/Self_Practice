package day34_tasks.carTask;

public class BMW extends Car {

    public BMW (String model, int year, double price, String color) {
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
