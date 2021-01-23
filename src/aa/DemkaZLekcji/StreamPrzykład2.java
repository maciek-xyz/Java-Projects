package aa.DemkaZLekcji;

import java.util.stream.Stream;

public class StreamPrzykład2 {
    public static void main(String[] args) {
        Stream.of("You","shall","not","pass")
                .forEach(x -> System.out.println(x));
    }
}
