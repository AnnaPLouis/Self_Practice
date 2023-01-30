package officeHoursWeek5;

public class ResultAfterColumn {
    public static void main(String[] args) {

        String result = "result count : 12345";

        String output = result.substring(result.indexOf(":")+1);

        output = output.trim();

        System.out.println(output);
    }
}
