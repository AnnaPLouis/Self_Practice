package day08_tasks;

public class NumberToWord2 {
    public static void main(String[] args) {


        int num = 5;

        String result = (num==1)? "one" :(num==2)? "two" :(num==3)? "three" :(num==4)? "four": "five";

        System.out.println(result);

    }
}
