import java.util.List;
import java.util.Arrays;

public class ExampleStreams {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5);
        int sum = number.stream()
                         .filter(n -> n % 2 == 0)
                         .map(n -> n * 2)
                         .reduce(0, Integer::sum);
        System.out.println(sum); 
    }
}