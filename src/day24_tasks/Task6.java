package day24_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {


        ArrayList<String> countryNames = new ArrayList<>();

        countryNames.addAll(Arrays.asList("Russia","USA", "New Zealand", "Bosnia and Herzegovina"));

        countryNames.removeIf(p-> p.length() >= 10);

        System.out.println(countryNames);



    }
}
