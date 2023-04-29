package Algorithms.week3;

import java.util.stream.IntStream;

public class Factorial {
    public static void main(String[] args) {

        System.out.println(Factorial(6));


    } public static int Factorial (int number){

        int factorial = IntStream.rangeClosed(1,number).reduce(1, (a,b)->a*b);


        return factorial;

    }
      /*
       Write a method that returns the factorial number of any given number.
Factorial: Factorial of a non-negative integer, is multiplication of all positive integers smaller than or equal to n.
For example, factorial of 6 is 6*5*4*3*2*1 which is 720.
         */
}
