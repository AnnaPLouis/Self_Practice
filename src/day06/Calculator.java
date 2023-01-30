package day06;

public class Calculator {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        char mathOperator = '%';

        if (mathOperator == '+') {
            System.out.println(num1+num2);
        }
        if (mathOperator == '-') {
            System.out.println(num1-num2);
        }
        if (mathOperator == '*') {
            System.out.println(num1*num2);
        }
        if (mathOperator == '/') {
            System.out.println(num1/num2);
        }
        if (mathOperator != '+' && mathOperator != '-' && mathOperator != '*' && mathOperator != '/' ){
            System.out.println("invalid operator");
        }
    }
}
