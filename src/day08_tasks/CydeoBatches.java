package day08_tasks;

public class CydeoBatches {

    public static void main(String[] args) {

        String batch = "US evening";

        String classTimes = "";
        String days = "";

        switch (batch){
            case "US evening":
                classTimes = "7-10";
                days = "M, T, W, Th, S, S";
                break;
            case "US morning":
                classTimes = "10-7";
                days = "M, T, Th, F";
                break;
            case  "EU":
                classTimes = "10-5";
                days = "M, T, W, Th, F";
                break;
            default:
                System.out.println("Invalid batch");
        }

        System.out.println("Class times are " + classTimes + " EST. "+days);
    }
}
