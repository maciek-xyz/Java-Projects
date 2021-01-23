package aa.DemkaZLekcji;

import java.util.Arrays;
import java.util.List;

public class StreamPrzykład6 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        numbers.stream()
                .peek(x -> System.out.println("Przed mapowaniem: " + x))
                .map(x -> x*x)
                .forEach(x -> System.out.println("Po mapowaniu: " + x));

    }
}
