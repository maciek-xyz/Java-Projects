package aa.DemkaZLekcji;

import java.util.Arrays;
import java.util.List;

public class StreamPrzykład3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John","Mariah","Bob","Pamela");
        names.stream().forEach(x -> System.out.println("Name: " + x));

        List<Integer> numbers = Arrays.asList(2,5,8,12);
        numbers.stream().forEach(x -> System.out.println("Wynik: " + x*2 ));
    }
}
