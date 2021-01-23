package aa.DemkaZLekcji;

import java.util.Arrays;
import java.util.List;

public class StreamsPrzykład4 {
    public static void main(String[] args) {
        List<String> texts = Arrays.asList("You","shall","not","pass");
        texts.stream()
                .filter(x -> x.length() > 3)
                .forEach(x -> System.out.println(x));
    }
}
