package OfficeHoursWeek8;

public class SameLetters {
    public static void main(String[] args) {


        String[] names = {"Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet", "Asya"};

        int count = 0;

        for (String each : names) {

            each = each.toLowerCase();

            if (each.charAt(0) == each.charAt(each.length()-1)){
                count++;
            }

        }

        System.out.println(count);


    }
}
