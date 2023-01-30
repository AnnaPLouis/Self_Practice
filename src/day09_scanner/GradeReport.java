package day09_scanner;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your grade:");

        int grade = input.nextInt();

        String result = (grade>0 && grade<=100)?
                (grade>=90) ? "A" :(grade>=80) ? "B" :(grade>=70)? "C" :(grade>=60) ? "D" : "F"


                : "Invalid entry";

        System.out.println("You scored "+ result);

        input.close();





        }
    }

