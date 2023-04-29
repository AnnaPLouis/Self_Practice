import java.util.Arrays;
import java.util.List;

public class NumberOfCharacters {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("Java", "apple", "honda", "developer");

        words.stream().forEach(p-> System.out.println(p.length()));
    }
}
