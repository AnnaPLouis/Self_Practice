package day07_tasks;

public class AgeGroups {
    public static void main(String[] args) {

        int age = 45;

        String result = "";

        if (age >= 0 && age <= 150){

            if (age < 21) {
                result = "teenager";
            }
            if (age >=21 && age<55){
                result = "adult";
            }
            if (age >= 55){
                result = "senior";
            }
        }else{
            result = "invalid";
        }
        System.out.println(result);
    }
}
