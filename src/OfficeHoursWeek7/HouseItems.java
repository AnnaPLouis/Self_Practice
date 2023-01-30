package OfficeHoursWeek7;

public class HouseItems {

    public String name;
    public String color;
    public int amount;

    public void setInfo(String name, String color, int amount) {
        this.name = name;
        this.color = color;
        this.amount = amount;
    }

    public String toString() {
        return "HouseItems{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", amount=" + amount +
                '}';
    }
}
