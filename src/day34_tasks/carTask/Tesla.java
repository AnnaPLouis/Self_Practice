package day34_tasks.carTask;

public class Tesla extends Car implements AutoPilot{

    public Tesla(String model, int year, double price, String color) {
        super(model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Say START to start " + getMake() + getModel());
    }

    @Override
    public void drive() {
        System.out.println(getMake() + getModel() + " is driving");

    }

    @Override
    public void autoPark() {

        System.out.println(getMake() + getModel() + " is self parking");

    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + getModel() + " is self driving");

    }
}
