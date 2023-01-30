package day34_tasks.carTask;

public abstract class Car {

    private final String make, model;
    private final int year;
    private double price;
    private String color;

    public Car(String model, int year, double price, String color) {
        this.make = getClass().getSimpleName();;

        if (model.isEmpty()){
            System.out.println("Model cannot be empty");
            System.exit(1);}
        this.model = model;

        if (year < 1886){
            System.out.println("year can not be less than 1886");
            System.exit(1);
        }
        this.year = year;
        setPrice(price);
        setColor(color);
    }

    public String getMake() {

        if (make == null){
            System.out.println("make cannot be null");
            System.exit(1);
        }

        return make;
    }

    public String getModel() {

        if (model == null){
            System.out.println("model cannot be null");
            System.exit(1);
        }
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price < 0){
            System.out.println("price can not be negative");
        }
        this.price = price;
    }

    public String getColor() {

        if (color == null){
            System.out.println("color cannot be null");
            System.exit(1);
        }
        return color;
    }

    public void setColor(String color) {

        if (color.isEmpty()){
            System.out.println("Color cannot be empty");
            System.exit(1);
        }
        this.color = color;
    }

    public abstract void start();
    public abstract void drive();

    public void stop(){
        System.out.println("press the brake to stop " + make + " " + model);
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    /*Variables:
					make (final), model (final), year (final), price, color

				Encapsulate all the fields

				Add a constructor that can set all the fields

				Condition for setting the fields:
						1. make, model, color can not be null
						2. make, model, color can not be empty
						2. year can not be less than 1886
						2. price can not be negative

				abstract methods:
					start();
					drive();

				none abstract methods:
					stop()
					toString()

     */

}
