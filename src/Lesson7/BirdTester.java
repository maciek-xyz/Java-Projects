package Lesson7;

public class BirdTester {
    public static void main(String[] args) {
        Bird falcon = new Bird();
        Bird owl = new Bird();
        Bird parrot = new Bird();

        falcon.fligth(10);
        owl.fligth(20);
        parrot.fligth(30);

        System.out.println(owl.getKm() + " " + owl.getKilometers());

    }
}
