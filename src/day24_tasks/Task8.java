package day24_tasks;

import java.time.LocalDate;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your birth year");

        boolean BirthYearIsLeap = BirthYearIsLeap(input.nextInt());

        System.out.println(BirthYearIsLeap);

    }






    public static boolean BirthYearIsLeap (int year){

        LocalDate birthDay = LocalDate.of (year, 04, 18);

        boolean BirthYearIsLeap = birthDay.isLeapYear();

        return BirthYearIsLeap;

    }

}
