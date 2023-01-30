package OfficeHoursWeek8;

public class LongestPalindrome {
    public static void main(String[] args) {

        String [] arr = {"java","civic", "mom", "longest word", "racecar"};

        String result = "no palindrome";

        String maxLengthPalindrome = "";

        for (int i = 0; i < arr.length; i++) {

            if (isPalindrome(arr[i])){
                if (maxLengthPalindrome.length()<arr[i].length()){
                    maxLengthPalindrome = arr[i];
                }

        }



        }

        if (!maxLengthPalindrome.isEmpty()){
            result = maxLengthPalindrome;

        }
        System.out.println(result);




    }

    public static boolean isPalindrome (String str) {

        boolean flag = false;

        String reversed = "";

        if (str.contains(" ")) {
            str.replace(" ", "");
        }

        str.toLowerCase();

        for (int i = str.length() - 1; i >= 0; i--) {

            reversed += str.charAt(i);

        }
        if (str.equals(reversed)){
            flag = true;
        }
        return flag;
    }


}
