public class AnimalFeast {

    public static void main(String[] args) {




        boolean allowedToBring = AllowedToBring("chickadee", "chocolate cake");


        System.out.println(allowedToBring);


    }

    public static boolean AllowedToBring(String beast, String dish) {

        if (beast.substring(0, 1).equals(dish.substring(0, 1)) &&
                beast.substring(beast.length() - 1).equals(dish.substring(dish.length() - 1))) {
            return true;
        }
        return false;
    }


    }

