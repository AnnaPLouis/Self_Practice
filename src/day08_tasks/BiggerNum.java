package day08_tasks;

public class BiggerNum {
    public static void main(String[] args) {


        int n1 = 10;
        int n2 = 13;
        int n3 = 12;

        String result = (n1 > n2 & n1 > n3) ? "N1 is bigger" : (n2 > n1 && n2 > n3) ? "N2 is bigger" : "N3 is bigger";
        System.out.println(result);
    }
}