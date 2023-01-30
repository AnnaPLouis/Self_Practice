package day09_scanner;

import java.util.Scanner;

public class NumberOfHousemates {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Input number of housemates:");

        int num = input.nextInt();

        String result = ( num > 3) ? "Lives with less than 3 people" :(num>=3 && num<=6) ? "Lives with 3 - 6 people"
        : "Lives with more then 6 ppl";

        System.out.println(result);

        input.close();









    }






}
