package day06;

public class NetIncomeCalc {
    public static void main(String[] args) {


        int salary = 100_000;
        double taxRate = 0;
        boolean isMarried = false;

        if (salary >= 130_000){
            taxRate = 0.35;
        }
        if (salary <130_000 && salary>=100_000){
            taxRate = 0.3;
        }
        if (salary <100_000 && salary>=80_000){
            taxRate = 0.25;
        }
        if (salary <80_000){
            taxRate = 0.2;
        }


        if (isMarried){
            taxRate -= 0.05;
        }

        double salaryAfterTax = salary - (salary*taxRate);

        System.out.println(salaryAfterTax);

    }
}
