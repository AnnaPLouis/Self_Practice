package day09_scanner;

import java.util.Scanner;

public class SalaryCalc {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter hourly rate:");

        double hourlyRate = input.nextDouble();

        System.out.println("how many hours you work in a week:");

        double weeklyHours = input.nextDouble();

        System.out.println("enter state tax:");

        double stateTaxRate = input.nextDouble();

        System.out.println("enter federal tax:");

        double federalTaxRate = input.nextDouble();


        double salaryBeforeTax = (weeklyHours*hourlyRate)*52;
        double stateTax = salaryBeforeTax*stateTaxRate / 100;
        double federalTax = salaryBeforeTax*federalTaxRate / 100;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;


        System.out.println("Gross pay is: $"+ salaryBeforeTax+
                "\n\tFederal tax is: $"+ federalTax+
                "\n\tState tax is: $"+stateTax+
                "\n\tTotal tax is: $"+totalTax+
                "\n\tNet income is: $"+salaryAfterTax);


input.close();

    }
}
