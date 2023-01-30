package day09_scanner;

import java.util.Scanner;

public class MilkesToKm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter miles:");

        int miles = input.nextInt();

        System.out.println(miles + " miles equals to " + (miles*1.609) + " km.");

        input.close();


    }
}
