package day12_tasks;

public class CombineTwoWords {
    public static void main(String[] args) {



        String combined = combined("one", "eight");

        System.out.println(combined);



    }
    public static String combined (String first, String second) {

        String combined = (first.charAt(first.length() - 1) == second.charAt(0)) ? first + second.substring(1) : first+second;
        return combined;
    }


}