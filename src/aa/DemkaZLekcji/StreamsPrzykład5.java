package aa.DemkaZLekcji;

import java.util.Arrays;
import java.util.List;

public class StreamsPrzykład5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5,2,6,9,4,8);
        numbers.stream()
                .peek(n -> System.out.println("Przed filtrowaniem: " + n))
                .filter(n -> n > 5)
                .forEach(n -> System.out.println("Po filtrowaniu: " + n));
    }
}
