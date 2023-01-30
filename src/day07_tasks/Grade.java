package day07_tasks;

public class Grade {
    public static void main(String[] args) {

        char grade = 'B';

        String result = "";

        if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F'){
            if (grade == 'A'){
                result = "Excellent";
            }
            if (grade == 'B'){
                result = "Great Job";
            }
            if (grade == 'C'){
                result = "Good";
            }
            if (grade == 'D'){
                result = "Passed";
            }
            if (grade == 'F'){
                result = "Failed";
            }

        }else {
            result = "Invalid";
        }
        System.out.println(result);
    }
}
