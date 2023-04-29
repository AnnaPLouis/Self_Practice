package CodeWars.kyu7;

import java.util.Arrays;

public class FakeBinary {
    public static String fakeBin(String numberString) {
        String result = "";

        int[] array = new int[numberString.length()];

        for (int i = 0; i < numberString.length(); i++) {
            array[i] = Character.getNumericValue(numberString.charAt(i));
        }

        for (int each : array) {
            if (each<5){
                result+=0;
            }else {
                result+=1;
            }

        }
        return result;
    }

    public static String fakeBin2(String numberString) {
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }
}
