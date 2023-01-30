import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //WRITE YOUR CODE BELOW:

        int count = 0;
        for (int each : nums) {
            if (each%2 ==0 ){
                count++;

            }

        }

        System.out.println(count);





    }



}

