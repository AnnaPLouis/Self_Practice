package day12_tasks;

public class eligibleToVote {
    public static void main(String[] args) {

     eligibleToVote(true, 11);


    }
    public static void eligibleToVote(boolean isAmerican, int age) {

        if(isAmerican == true && age >=18) {

            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }



    }
}
