package OfficeHoursWeek7;

public class GasTank {

    public double amount;
    public double capacity;

    public void setInfo(double amount, double capacity) {
        this.amount = amount;
        this.capacity = capacity;
    }


    public String toString() {
        return "GasTank{" +
                "amount=" + amount +
                ", capacity=" + capacity +
                '}';
    }

    public void addGas (double gas){

        if ((amount + gas)<capacity){
            amount += gas;
        }else {
            amount = capacity;
        }
    }

    public void useGas (double use){
        amount -= use;
        if ((amount - use) <=0){
            amount = 0;
        }
    }

    public boolean isEmpty() {

        boolean isEmpty = (amount < 0.1) ? true : false;
        return isEmpty;
    }

    public boolean isFull() {

        boolean isFull = (amount > (capacity - 0.1)) ? true : false;
        return isFull;
    }

    public void getGasLevel()
    {
        System.out.println(amount);
    }

    public double fillUp (){
        double fillUp = capacity-amount;
        amount+=fillUp;
        return fillUp;
    }


}
