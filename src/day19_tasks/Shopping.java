package day19_tasks;

public class Shopping {
    public static void main(String[] args) {

        String[] items  = {"Shoes","Jacket","Gloves","AirPods","iPad","iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        int firstIndex = items[2].indexOf("G");

        System.out.println(firstIndex);

        for (int i = 0; i < items.length; i++) {

            boolean containsIPad = (items[i].contains("iPad")) ? true : false;

            if (containsIPad){
                System.out.println(containsIPad);
            }
        }



            }

        }



