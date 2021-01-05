package Lesson8;

import java.util.*;

public class ItemsInOnlineStore {
    public static void main(String[] args) {

        Map<String, Integer> namePrice = new TreeMap<>();
        namePrice.put("Monitor", 458);
        namePrice.put("Computer", 2500);
        namePrice.put("Keyboard", 100);
        namePrice.put("Mouse", 60);
        namePrice.put("Printer", 349);
        namePrice.put("Xbox one console", 1200);
        namePrice.put("SONY PlayStation 4", 1289);
        namePrice.put("SONY PlayStation 5", 1999);
        namePrice.put("Headphones", 199);
        namePrice.put("Microphone", 40);
        namePrice.put("Laptop", 3100);

        System.out.println(namePrice); // sorted by item names
        System.out.println(namePrice);




//        Collection<String> keys = namePrice.keySet();
//        Collection<Integer> values = namePrice.values();
//
//
//
//        List<Collection<String>> byItem = new ArrayList<>();
//        byItem.add(namePrice.keySet());
//        System.out.println(byItem); //sorted by item name
//
//
//
//        List<Collection<Integer>> byPrice = new ArrayList<>();
//        byPrice.add(namePrice.values());
//        System.out.println(byPrice);

        //sorted by item name in reverse order
        //sorted by price from the cheapest to the most expensive item
        //sorted by price from the most expensive to the cheapest



    }

}
