package day06;

public class NumberToWord {
    public static void main(String[] args) {

        int number = 5;

        String result = "";

        if (number == 0) {
            result = "Zero";
        }

        if (number == 1){
            result = "One";
        }
        if (number == 2){
            result = "Two";
        }
        if (number == 3) {
            result = "Three";
        }
        if (number == 4) {
            result = "Four";
        }
        if (number == 5) {
            result = "Five";
        }
        if (number == 6) {
            result = "Six";
        }
        if (number == 7) {
            result = "Seven";
        }
        if (number == 8) {
            result = "Eight";
        }
        if (number == 9) {
            result = "Nine";
        }
        System.out.println(result);
    }
}
