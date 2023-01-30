package day07_tasks;

public class FINRA {
    public static void main(String[] args) {

        int number = 15;

        if (number%3 == 0 || number%5 == 0 || (number%3 == 0 && number%5 == 0)){

            if ((number%3 == 0) && (number%5 != 0)){
                System.out.println("FIN");
            }
            if ((number%5 == 0) && (number%3 != 0)){
                System.out.println("RA");
            }
            if (number%3 == 0 && number%5 == 0){
                System.out.println("FINRA");
            }


        }else{
            System.out.println(number);
        }
    }
}
