package day12_tasks;

public class DaysInMonth {
    public static void main(String[] args) {

     daysInMonth("june");

    }
    public static void daysInMonth (String month){

        month = month.toLowerCase();

        String result = "";

        switch (month){

            case "february":
                result = "28 days";
                break;
            case "january": case "march": case "may": case "july": case "august": case "october": case "december":
                result = "31 days";
                break;
            case "april": case "june": case "september": case "november":
                result = "30 days";
                break;

            default:
                result = "Invalid";
        }

        System.out.println(result);


    }
}
