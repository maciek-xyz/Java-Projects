package aa.DemkaZLekcji;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPrzykład8 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ala","ma","kota");
        String resultString1 = names.stream().collect(Collectors.joining(","));
        System.out.println("Wynik 1: " + resultString1);
        String resultString2 = names.stream().collect(Collectors.joining("-"));
        System.out.println("Wynik 2: " + resultString2);
        String resultString3 = names.stream().collect(Collectors.joining());
        System.out.println("Wynik 3: " + resultString3);
    }
}
