package day08_tasks;

public class Calculator {
    public static void main(String[] args) {
        double n1 = 5;
        double n2 = 10;
        char operator = '%';

        switch (operator) {
            case '+':
                System.out.println(n1 + n2);
                break;
            case '-':
                System.out.println(n1 - n2);
                break;
            case '*':
                System.out.println(n1 * n2);
                break;
            case '/':
                System.out.println(n1 / n2);
            default:
                System.out.println("invalid operator");
        }
    }
}
