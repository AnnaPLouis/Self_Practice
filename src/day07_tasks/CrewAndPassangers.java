package day07_tasks;

public class CrewAndPassangers {
    public static void main(String[] args) {
        int numberOfPeople = 55;

        String result1 = (numberOfPeople == 50 || numberOfPeople == 75 || numberOfPeople == 100) ?

                (numberOfPeople == 50) ? "20 crew, 30 passengers"
                        : (numberOfPeople == 75) ? "25 crew, 50 passengers"
                        : "30 crew, 70 passengers"

        : "Invalid";



        System.out.println(result1);
        System.out.println("-------------------");

        String result2 = "";

        switch (numberOfPeople) {
            case 50:
                result2 = "20 crew, 30 passengers";
                break;
            case 75:
                result2 = "25 crew, 50 passengers";
                break;
            case 100:
                result2 = "30 crew, 70 passengers";
                break;
            default:
                result2 ="Invalid";

        }
        System.out.println(result2);


    }




}
