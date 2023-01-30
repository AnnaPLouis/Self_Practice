package day08_tasks;

public class OxTank {
    public static void main(String[] args) {

        int level = 45;
        String result = (level>90)? "Your tank is full" :(level>80) ? "Still good" :(level>70) ? "Don't go too far"
                :(level>60)? "Start to head back" : "Be careful now you at 50%";

        System.out.println(result);
    }
}

