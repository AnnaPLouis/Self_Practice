package OfficeHoursWeek4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);

        int n1 = input.nextInt();

        int n2 = input.nextInt();

        String result = (n1 > n2) ? String.valueOf(n1) :(n2>n1)? String.valueOf(n2) : "equal";

        System.out.println(result);


    }
}
