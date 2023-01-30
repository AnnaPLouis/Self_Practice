package day07_tasks;

public class Browser {
    public static void main(String[] args) {

        String browserName = "Chrome";


        if (browserName == "Chrome" || browserName == "Firefox" || browserName == "Opera" || browserName == "Safari" || browserName == "Edge") {
            if (browserName == "Chrome") {
                System.out.println(browserName + " Browser is selected");
            }
            if (browserName == "Firefox") {
                System.out.println(browserName + " Browser is selected");
            }
            if (browserName == "Opera") {
                System.out.println(browserName + " Browser is selected");
            }
            if (browserName == "Safari") {
                System.out.println(browserName + " Browser is selected");
            }
            if (browserName == "Edge") {
                System.out.println(browserName + " Browser is selected");
            }
        } else {
            System.out.println("Invalid Browser Name");
        }
    }
}
