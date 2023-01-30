package day13_tasks;

public class IsOddMethod {
    public static void main(String[] args) {


        boolean isOdd = isOdd(12);
        System.out.println(isOdd);



    }


    public static boolean isOdd (int num){


        boolean isOdd = (num%2 != 0) ? true : false;

        return isOdd;
    }
}
