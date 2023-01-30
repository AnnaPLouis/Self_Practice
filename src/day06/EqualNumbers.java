package day06;

public class EqualNumbers {
    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 1;
        int num3 = 5;

        if (num1==num2){
            System.out.println("n1&n2 are equal");
        }
        if (num1==num2 && num1==num3){
            System.out.println("all equal");
        }
        if (num2 == num3){
            System.out.println("n2&n3 are equal");
        }
        if (num1==num3){
            System.out.println("n1&n3 are equal");
        }
        if (num1!=num2 && num1!=num3 && num2!=num3) {
            System.out.println("none of them are equal");
        }


    }






}

/*Create a class named EqualNumbers, and write a program that can check the equality of the three given numberrs
	 			declare 3 numbers n1, n2, n3
	 			if all are equal ==> print "all equal"
	  			if only n1 and n2 are equal  =>print  "n1&n2 are equal"
	   			if only n2 and n3 are equal ==>print "n2&n3 are equal"
	   			if only n3 and n1 are qual ==>print "n3&n1 are equal"
				if none of them are euqal ==> none of them are equal

*/


