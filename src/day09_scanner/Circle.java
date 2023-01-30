package day09_scanner;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Input radius:");

        double radius = input.nextDouble();

        System.out.println("Area = " + (radius*radius*3.14));
        System.out.println("Perimeter = " + (2*3.14*radius));

        input.close();




        }
    }

