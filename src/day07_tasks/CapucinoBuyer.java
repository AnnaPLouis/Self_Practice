package day07_tasks;

public class CapucinoBuyer {
    public static void main(String[] args) {

        String size = "blah";

        String result = "";

        if (size == "Venti" || size == "Grande" || size == "Tall"){

            if (size == "Venti"){
                result = "price is $4.29\n" +
                        "150 calories";
            }
            if (size == "Grande"){
                result = "price is $3.99\n" +
                        "120 calories";
            }
            if (size == "Tall"){
                result = "price is $3.69\n" +
                        "90 calories";
            }







        }else{
            result = "Invalid Size";

        }
        System.out.println(result);
    }

}
