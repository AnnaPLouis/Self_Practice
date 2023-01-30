package day09_scanner;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your current speed:");

        int currentSpeed = input.nextInt();

        int speedLimit = 55;

        if (currentSpeed>speedLimit){
            System.out.println("You are diving " +(currentSpeed-speedLimit)+" mph over the limit. Slow down!");
        }

        input.close();



    }
}
