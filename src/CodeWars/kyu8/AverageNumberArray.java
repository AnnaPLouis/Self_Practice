package CodeWars.kyu8;

import java.util.Arrays;

public class AverageNumberArray {
    public static double find_average(int[] array){

        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }

        return sum/array.length;

    }

    public static double find_average2(int[] array){

        return Arrays.stream(array).average().getAsDouble();
    }


}
