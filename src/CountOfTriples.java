import java.util.Scanner;

public class CountOfTriples {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String str  = input.nextLine();

        int countOfTriples = 0;

        for (int i = 0; i < str.length()-2; i++) {

            if (str.charAt(i) == str.charAt(i+1) && str.charAt(i+1) == str.charAt(i+2)){
                countOfTriples++;
            }

        }

        System.out.println(countOfTriples);





    }
}

