package OfficeHoursWeek7;

public class TestParkingMeter {
    public static void main(String[] args) {

        ParkingMeter meter = new ParkingMeter();
        meter.timeLeft = 15;
        meter.maxTime = 60;

        boolean increase = meter.add(25);

        System.out.println(increase);

        meter.tick();
        meter.tick();
        meter.tick();

        System.out.println(meter.timeLeft);

    }
}
