package day09_scanner;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("age:");
        int age = input.nextInt();
        System.out.println("gender");
        String gender = input.next();
        input.nextLine();
        System.out.println("full name");
        String full_name = input.nextLine();
        System.out.println("phone number");
        long phone_number = input.nextLong();
        System.out.println("zip");
        int zip = input.nextInt();
        input.nextLine();
        System.out.println("school name");
        String school_name = input.nextLine();
        System.out.println("city name");
        String city_name = input.nextLine();
        System.out.println("state name");
        String state_name = input.next();
        System.out.println("building number");
        int building_number = input.nextInt();
        input.nextLine();
        System.out.println("street name");
        String street_name = input.nextLine();

        System.out.println("Full name = "+full_name +"\nAge = "+age + "\nGender = "+ gender
        + "\nPhone number = " + phone_number +"\nAddress: \n\t\t\t"+ building_number +" " + street_name +
                "\n\t\t\t" + city_name + ", " + state_name + ", " + zip + "\nSchool name = " + school_name);





    }
}
