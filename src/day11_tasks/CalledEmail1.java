package day11_tasks;

public class CalledEmail1 {
    public static void main(String[] args) {


        String name = "mike";
        String lastName = "tyson";

        String fullName = name+" " +lastName;

        String email = name + "_" + lastName + "@gmail.com";

        String email1 = fullName.substring(fullName.indexOf(' ')+1) + "_"
                +( fullName.substring(0,fullName.indexOf(' ')) + "@gmail.com");


        System.out.println(email1);







    /*
    Create a class calledEmailTask1.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

    Write a program that can swap first name with last name in the email (Separated by an underscore).
    If the email doesn't contain an underscore print the given input email.

        Ex:
            input: mike_tyson@gmail.com
            output: tyson_mike@gmail.com
     */
    }
}