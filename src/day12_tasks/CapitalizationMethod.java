package day12_tasks;

public class CapitalizationMethod {
    public static void main(String[] args) {

      String format = capitalization("cYdEo") ;

        System.out.println(format);

    }public static String capitalization (String word){

        String capitalization = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
   return capitalization;
    }

}
