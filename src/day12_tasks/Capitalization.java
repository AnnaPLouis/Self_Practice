package day12_tasks;

public class Capitalization {
    public static void main(String[] args) {


        capitalization("aNNa","lOUis");


    }
    public static void capitalization (String first, String last){

        String capitalization = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase()+
                " "+last.substring(0,1).toUpperCase() +  last.substring(1).toLowerCase();
        System.out.println(capitalization);

    }
}
