package OfficeHoursWeek4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the first number:");

        double n1 = input.nextDouble();

        System.out.println("enter a math operator:");

        char op = input.next().charAt(0);

        System.out.println("enter the second number");

        double n2 = input.nextDouble();


        switch (op) {
            case '+':
                System.out.println(n1 + n2);
                break;
            case '-':
                System.out.println(n1 - n2);
                break;
            case '*':
                System.out.println(n1 * n2);
                break;
            case '/':
                System.out.println(n1 / n2);
                break;
            default:
                System.out.println("invalid operator");
        }

    }
}
