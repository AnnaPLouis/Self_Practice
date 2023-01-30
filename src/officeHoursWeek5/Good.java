package officeHoursWeek5;

import java.util.Scanner;

public class Good {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sentence:");
        String sentence = input.next();

        boolean hasGood = ((sentence.substring(0,4).equals("good")) || (sentence.substring(1,5).equals("good"))) ? true : false;

        System.out.println(hasGood);






    }
}
