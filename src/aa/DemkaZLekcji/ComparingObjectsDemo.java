package aa.DemkaZLekcji;

import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class ComparingObjectsDemo {
    public static void main(String[] args) {
        House one = new House(3, 50, 1, "Krakow");
        House two = new House(4, 45, 2, "Katowice");
        House three = new House(6, 25, 4, "Warszawa");

        System.out.println(two.compareTo(one));

        TreeSet<House> houses = new TreeSet<>(List.of(one, two, three));
        System.out.println(houses);

        houses = new TreeSet<>(new HouseByFloorNumberComparator());
        houses.add(one);
        houses.add(two);
        houses.add(three);
        System.out.println(houses);

        houses = new TreeSet<>(new HouseByFloorNumberComparator().reversed());
        houses.add(one);
        houses.add(two);
        houses.add(three);
        System.out.println(houses);

        houses = new TreeSet<>(Comparator.nullsLast(new HouseByFloorNumberComparator()));
        houses.add(one);
        houses.add(two);
        houses.add(three);
        houses.add(null);
        System.out.println(houses);
    }
}
