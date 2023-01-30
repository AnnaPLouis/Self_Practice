package OfficeHoursWeek8;

import java.util.Arrays;

public class MultipleWords {

    public static void main(String[] args) {

        String unmodifiedString = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, frigde,dish washer";

        String modifiedString = "";

        String [] unmodifiedStringArray = unmodifiedString.split(",");

        for (int i = 0; i < unmodifiedStringArray.length; i++) {

            if (unmodifiedStringArray[i].trim().contains(" ")){
                modifiedString += unmodifiedStringArray[i] + "\n";
            }
        }

        System.out.println(modifiedString.trim());










    }



}
