package day09_scanner;

import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("how many total shares they have already?");

        int shares = input.nextInt();

        if (shares>0) {

            System.out.println("how much your total value in the stock market is?");

            double totalValue = input.nextDouble();

            input.nextLine();

            System.out.println("enter the name of the company you have the most shares in:");

            String company = input.nextLine();

            System.out.println("Your total stock market holding is $" + totalValue + " which is made up of " + shares + " shares. " + company + " is your company holdings.");



input.close();




            }











        }





    }

