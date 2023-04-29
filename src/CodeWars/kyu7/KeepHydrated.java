package CodeWars.kyu7;

public class KeepHydrated {

    public static void main(String[] args) {

        int liters = Liters(6.4);
        System.out.println(liters);

    }


    public static int Liters(double time) {

        return  (int) (time * 0.5);

    }
}
