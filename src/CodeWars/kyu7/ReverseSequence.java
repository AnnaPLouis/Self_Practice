package CodeWars.kyu7;

import java.util.Arrays;

public class ReverseSequence {
    public static void main(String[] args) {

        int[] a = reverse(5);

        System.out.println(Arrays.toString(a));

    }




    public static int[] reverse(int n){
           int[] result = new int[n];
        for (int i = 0; i < result.length; i++) {
            result[i]=n;
            n--;
        }
        return result;
    }


}
