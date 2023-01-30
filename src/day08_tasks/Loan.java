package day08_tasks;

public class Loan {

    public static void main(String[] args) {

        int salary = 35_000;
        int cs = 650;

        String result = (salary >= 60_000 && cs>=650) ? "Loan Approved" : "Loan Denied";

        System.out.println(result);
    }
}
