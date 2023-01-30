package officeHoursWeek5;

public class FirstEqualsLastCharacter {
    public static void main(String[] args) {


        String word = "educated";


        boolean b = (word.substring(0,2).equals(word.substring(word.length()-2))) ? true : false;

        System.out.println("The first two characters appear in the last is: "+b);

        if (b){
            System.out.println(word.replaceFirst("ed",""));
        } else {
            System.out.println(word);
        }


    }
}
