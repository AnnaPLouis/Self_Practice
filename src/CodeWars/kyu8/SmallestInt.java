package CodeWars.kyu8;

import java.util.Arrays;

public class SmallestInt {
    public static void main(String[] args) {

        int a = findSmallestInt(new int[]{34, -345, -1, 100});
        System.out.println(a);
    }
    public static int findSmallestInt(int[] args) {
        return Arrays.stream(args).min().getAsInt();

    }
}
