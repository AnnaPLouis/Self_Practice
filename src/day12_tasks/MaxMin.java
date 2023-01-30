package day12_tasks;

public class MaxMin {
    public static void main(String[] args) {

 int max = max(2,3);
 int min = min(5,6);

        System.out.println(max + "+" + min);



    }
    public static int max (int num1, int num2){

        int max = (num1>num2)? num1 : num2;
        return max;

    }
    public static int min (int num1, int num2){

        int min = (num1<num2)? num1 : num2;
        return min;
    }
}
