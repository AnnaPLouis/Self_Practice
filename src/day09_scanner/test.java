package day09_scanner;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String email = "";
        String street = "";


        System.out.println("Welcome to the patient portal!\n Please enter your personal information \nEnter your first name");
        String first_name = scan.next();

        System.out.println ("Enter your last name");
        String last_name = scan.next();

        // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        street = scan.nextLine();

        // continue for city
        System.out.println("Enter your city ");
        String city_name = scan.next();

        System.out.println("Enter your state");
        String state_name = scan.next();

        System.out.println("Enter your zip code");
        int zip = scan.nextInt();

        System.out.println("Enter your work phone number");
        long workPhoneNumber = scan.nextLong();

        System.out.println("Enter your personal phone number");
        long personalPhoneNumber = scan.nextLong();


        System.out.println("Enter your age");
        int age = scan.nextInt();

        System.out.println("Enter your height");
        double height = scan.nextDouble();

        System.out.println("Enter your weight");
        double weight = scan.nextDouble();

        System.out.println("Are you married?");
        boolean isMarried = scan.nextBoolean();

        String contact = "work Phone Number: " + workPhoneNumber+ ", personal Phone Number " + personalPhoneNumber+ ", email: "+ email;

        String fullName = first_name + " "+last_name;

        String address = street + ", " + state_name + ", "+
                state_name + ", "+ zip;


        System.out.println("Patient personal information");
        System.out.println("Full name: " +fullName);
        System.out.println("Address: " + address);
        System.out.println("Contact: "+ contact);
        System.out.println("Age:" + age);
        System.out.println("Height: "+height);
        System.out.println("Weight: "+weight);
        System.out.println("Married: " + isMarried);
    }
    }

