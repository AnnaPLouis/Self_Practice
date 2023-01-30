package day11_tasks;

public class WebsiteAddress {
    public static void main(String[] args) {

        String website = "www.cydeoschool.com";

        boolean starts = website.startsWith("www.");
        boolean ends1  = website.endsWith(".com");
        boolean ends2  = website.endsWith(".edu");
        boolean ends3  = website.endsWith(".gov");

        if (starts = true && (ends1 == true || ends2 == true || ends3 == true)) {
            System.out.println("Valid");

        }else {
            System.out.println("Invalid");
        }



        /*1. Create a class named WebsiteAddress, and write a program that can check
         if the given website is valid website or not
            starts with: www.
            ends with: .com, .edu, .gov

         */
    }
}
