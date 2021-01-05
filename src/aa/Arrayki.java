package aa;

import java.util.*;


public class Arrayki {
    public static void main(String[] args) {
        List<Pioesnka> piosenki = new ArrayList<Pioesnka>();
        piosenki.add(new Pioesnka("Autobiografia", "Perfect",7,80));
        piosenki.add(new Pioesnka("Zamki na piasku", "Lady Pank", 5, 120));
        piosenki.add(new Pioesnka("Jolka Jolka, pamiętasz", "Budka Suflera",9,100));
        piosenki.add(new Pioesnka("Piosenka Księżycowa","Varius Manx",7, 90));
        piosenki.add(new Pioesnka("All my love","Led Zeppelin", 9, 120));
        piosenki.add(new Pioesnka("Mniej niż zero","Lady Pank",7, 100));
        piosenki.add(new Pioesnka("All you need is love", "The Beatles", 10, 90));

        Collections.sort(piosenki, Pioesnka::compareTo);
        System.out.println(piosenki);

        HashSet<Pioesnka> zbiorPiosenek = new HashSet<Pioesnka>();
        zbiorPiosenek.addAll(piosenki);
        System.out.println(zbiorPiosenek);

        TreeSet<Pioesnka> zbiorPiosnek = new TreeSet<Pioesnka>();
        zbiorPiosnek.addAll(piosenki);
        System.out.println(zbiorPiosnek);

        //System.out.println(piosenki);

        //piosenki.forEach(System.out::println);
    }



}
