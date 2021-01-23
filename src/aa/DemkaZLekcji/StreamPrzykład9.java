package aa.DemkaZLekcji;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPrzykład9 {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Jan", "Kowalski", "Wrocław"));
        customers.add(new Customer("Adam", "Nowak", "Warszawa"));
        customers.add(new Customer("Joanna", "Lipnicka", "Wrocław"));
        customers.add(new Customer("Adaś", "Miauczyński", "Sosnowiec"));

        Map<String, List<Customer>> customersByCityMap = customers.stream()
                .collect(Collectors.groupingBy(c -> c.getCity()));

        System.out.println("========MAPA WYNIKOWA==========");
        System.out.println(customersByCityMap);

        List<Customer> customersFromWrocław = customersByCityMap.get("Wrocław");
        System.out.println("=========KLIENCI Z WROCŁAWIA========");
        System.out.println(customersFromWrocław);

    }
    static class Customer {
        private String firstName;
        private String secondName;
        private String city;

        public Customer(String firstName, String secondName, String city) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.city = city;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getSecondName() {
            return secondName;
        }

        public void setSecondName(String secondName) {
            this.secondName = secondName;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        @Override
        public String toString() {
            return  firstName + " " + secondName ;
        }
    }
}
