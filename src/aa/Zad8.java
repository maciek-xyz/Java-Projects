package aa;

import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Please, input first value: ");
        double a = x.nextDouble();
        System.out.println("Please, input second value: ");
        double b = x.nextDouble();
        System.out.println("Please,input third value: ");
        double c = x.nextDouble();

        if (Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2)) {
            System.out.println("The triangle is rectangular");
        }
        else if (Math.pow(a,2) + Math.pow(c,2) == Math.pow(b,2)) {
            System.out.println("The triangle is rectangular");
        }
        else if (Math.pow(b,2) + Math.pow(c,2) == Math.pow(a,2)) {
            System.out.println("The triangle is rectangular");
        }
        else {
            System.out.println("The triangle isn't rectangular");
        }


    }
}
