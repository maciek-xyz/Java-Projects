package aa.DemkaZLekcji;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsPrzykład1 {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Jan", "Kowalski", "Kraków", 1990));
        customers.add(new Customer("Karol", "Cygal", "Poznań", 1975));
        customers.add(new Customer("Anna", "Dawidowicz", "Wrocław", 1992));
        customers.add(new Customer("Krystian", "Nowak", "Kraków", 1964));
        customers.add(new Customer("Dominik", "Dziadoń", "Limanowa", 1960));
        customers.add(new Customer("Dominik", "Dziadoń", "Limanowa", 1998));
        customers.add(new Customer("Konrad", "Kowalkiewicz", "Warszawa", 1978));
        customers.add(new Customer("Maciej", "Korzym", "Warszawa", 1988));
        customers.add(new Customer("Piotr", "Kowalczyk", "Kraków", 1995));
        customers.add(new Customer("Jan", "Kochanowski", "Kraków", 1948));


//        List<String> krakowList = new ArrayList<>();
//      System.out.println("====================TRADYCYJNY SPOSÓB===========================");
//
//        for (Customer customer : customers) {
//            if (customer.getCity().equals("Kraków")) {
//                String text = customer.getFirstName().toUpperCase() + " " + customer.getLastName().toUpperCase();
//                krakowList.add(text);
//            }
//        }
//        System.out.println(krakowList);

        System.out.println("=========================ZA POMOCĄ STRUMIENI==================");
        List<String> krakowList = customers.stream()
                .filter(c -> c.getCity().equals("Kraków"))
                .map(c -> c.getFirstName().toUpperCase() + " " + c.getLastName().toUpperCase())
                .collect(Collectors.toList());
        System.out.println(krakowList);
    }
}
