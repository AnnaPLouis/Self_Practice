package day08_tasks;

public class AgeGroups {

    public static void main(String[] args) {

        int age = 31;

        String result = (age>=1 && age<=2) ? "Infant" :(age>=3 && age<=5) ? "Toddler" :(age>=6 && age<=9)? "Kid"
                :(age>=10 && age<=12) ? "Pre-Teen" :(age>=13 && age<=17) ? "Teens" :(age>=18 && age<=20) ? "Young Adult"
                :(age>=21 && age<=39) ? "Adult" :(age>=40 && age<=84) ? "Senior" : "Old Senior";
        System.out.println(result);
    }
}
