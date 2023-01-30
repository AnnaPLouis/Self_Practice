package day13_tasks;

public class isEvenMethod {
    public static void main(String[] args) {


        boolean isEven = isEven(12);
        System.out.println(isEven);



    }


    public static boolean isEven (int num){


        boolean isEven = (num%2 == 0) ? true : false;

        return isEven;
    }
}
