package OfficeHoursWeek7;

public class ParkingMeter {

    public int timeLeft;
    public int maxTime;

    public void setInfo(int timeLeft, int maxTime) {
        this.timeLeft = timeLeft;
        this.maxTime = maxTime;
    }

    public boolean add(int amount) {
        boolean add = false;
        while (timeLeft + 30 < maxTime) {
            if (amount == 25) {
                timeLeft += 30;
            }
            add = true;
        }
        return add;

    }

    public void tick (){
        if (timeLeft>0){
        timeLeft--;}
    }

    public boolean isExpired(){
        boolean isExpired = (timeLeft == 0) ? true : false;
        return isExpired;
    }


    @Override
    public String toString() {
        return "ParkingMeter{" +
                "timeLeft=" + timeLeft +
                ", maxTime=" + maxTime +
                '}';
    }
}


