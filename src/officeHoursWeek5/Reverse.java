package officeHoursWeek5;

public class Reverse {
    public static void main(String[] args) {

        String word = "madam";
        String reverse = "madam";

        boolean isPalindrome = (word.charAt(0) == reverse.charAt(0) && word.charAt(1)==reverse.charAt(1)&& word.charAt(2) == reverse.charAt(2)
        && word.charAt(3) == reverse.charAt(3) && word.charAt(4) == reverse.charAt(4)) ? true : false;


        System.out.println(isPalindrome);






        /*Task05
Reverse a given String of length 5, and if original and reversed strings are same print true
input: "madam" --------reversed word=madam
output : true
input: "hello"
output: false  --- reversed word= olleh

         */
    }
}
