package Algorithms.week4;


public class ValidPalindrome {

    public static void main(String[] args) {

        System.out.println(ValidPalindrome("Do geese see God?"));


    } public static boolean ValidPalindrome (String s){

        String temp = s.replaceAll("[^A-Za-z]", "").toLowerCase();


        StringBuffer original = new StringBuffer(temp);
        StringBuffer reversed = original.reverse();

        return (reversed.toString()).equals(temp);


    }

}
