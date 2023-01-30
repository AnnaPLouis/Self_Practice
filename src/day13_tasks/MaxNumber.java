package day13_tasks;

public class MaxNumber {
    public static void main(String[] args) {

       int max= max(45,20);
        System.out.println(max);


    }
    public static int max(int num1, int num2){

       int max = (num1>num2) ? num1 : num2;

       return max;




    }
}
