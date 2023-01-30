package OfficeHoursWeek4;

public class Task1 {
    public static void main(String[] args) {


        int N = 2;

        String result = "";

        if (N%2 ==0||N%3==0||N%5==0){
                     if (N%2 == 0 && N%3!=0&&N%5!=0){
                         result ="Codility";
                     } else if (N%3 == 0 &&N%2!=0&&N%5!=0) {
                         result = "Test";
                     } else if (N%5 == 0 && N%3!=0&&N%2!=0) {
                        result = "Coders";
                     } else if (N%2 == 0 && N%3 == 0 && N%5 != 0) {
                         result = "Codility" + "Test";
                     } else if (N%2 == 0 && N%5 == 0 && N%3 != 0) {
                         result = "Codility" + "Coders";
                     } else if (N%5 == 0 && N%3 == 0 && N%2 != 0) {
                         result = "Test" + "Coders";
                     } else if (N%5 == 0 && N%3 == 0 && N%2 == 0) {
                         result = "Codility" + "Test" +"Coders";
                     }

        }else{
            result = String.valueOf(N);
        }
        System.out.println(result);
















        /*  Write a function:
        that, given a positive integer N  However, any number divisible by 2, 3 or 5 shouldbe replaced by the word

        Codility -- 2
        Test     -- 3
        Coders   -- 5

                - If a number is divisible by more than one of the numbers:2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order.

        EXPECTED

        numbers divisible by both 2 and 3 should be replacée by CodilityTest
        INPUT : 6    OUTPUT :  CodilityTest

        numbers divisible by allthree numbers: 2,3 and 5, should be replaced by CodilityTestCoders.
        INPUT : 30    OUTPUT :  CodilityTestCoders





         */
    }
}
