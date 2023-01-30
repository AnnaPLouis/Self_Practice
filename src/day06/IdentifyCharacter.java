package day06;

public class IdentifyCharacter {
    public static void main(String[] args) {
         char ch = 44;

         if (ch>=48 && ch<=57) {
             System.out.println("digit");
         }
         if ((ch>=65 && ch<=90) || (ch>=97 && ch<=122)){
             System.out.println("alphabetical");
         }
         if ((ch>=33 && ch<=47) || (ch>=58 && ch<=64) || (ch>=91 && ch<=96) || (ch>=123 && ch<=126)){
             System.out.println("special");
         }


    }
}
