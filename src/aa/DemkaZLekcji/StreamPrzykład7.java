package aa.DemkaZLekcji;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamPrzykład7 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5,2,1,2,9,8,3);

        List<Integer> numbersAsList = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Lista parzystych: " + numbersAsList);

        Set<Integer> numberAsSet = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toSet());
        System.out.println("Zbiór parzystych: " + numberAsSet);
    }
}
