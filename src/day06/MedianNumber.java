package day06;

public class MedianNumber {
    public static void main(String[] args) {

        int a = 17;
        int b = 15;
        int c = 16;

        if ((a > b && a < c) || (a > c && a < b)) {
            System.out.println(a + " is a median number ");
        }
        if ((b > a && b < c) || (b < a && b > c)) {
            System.out.println(b + " is a median number ");
        }
        if ((c > a && c < b) || (c < a && c > b)) {
            System.out.println(c + " is a median number ");
        }
    }
}
