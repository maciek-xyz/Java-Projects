package aa.DemkaZLekcji;

import java.util.Arrays;
import java.util.List;

public class LambdaPrzykład5 {
        public static final List<String> customers = Arrays.asList("Asia",  "Tomek", "Bartek", "Piotrek", "Ania", "Zuzia");

    public static void main(String[] args) {
        System.out.println("=========WYPISANIE KLIENTÓW========");
        performOnAllCustomers(x -> System.out.println(x));

        System.out.println("========WYPISANIE KLIENTÓW DUŻYMI LITERAMI");
        performOnAllCustomers(x -> System.out.println(x.toUpperCase()));

        System.out.println("=========WYPISANIE DŁUGOŚCI IMION KLIENTÓW============");
        performOnAllCustomers(x -> System.out.println(x + ": " + x.length()));

    }

    public static void performOnAllCustomers(Consumer<String> consumer){
        for (String listCustomers : customers) {
            consumer.accept(listCustomers);
        }
    }
}
