package day09_scanner;

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter the product name:");

        String product = input.nextLine();

        System.out.println("enter the price:");

        double price = input.nextDouble();

        System.out.println("enter the quantity:");

        int quant = input.nextInt();

        System.out.println("enter first name:");

        String name = input.next();

        System.out.println(name + ", your order for " + quant + " " + product + " has been placed. Your total is " + (price*quant));

    input.close();

    }
}
