package aa;

import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Please, input a value: ");
        double x = number.nextDouble();
        double result = Math.sqrt(x);
        System.out.println("The result is: " + result);
    }
}
