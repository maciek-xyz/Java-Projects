package Lesson5;
import java.util.Scanner;


public class PrimeNumbersOther {
    public static void main(String[] args) {

        boolean t = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input a number");
        int value = scanner.nextInt();

        for (int i = 2; i <= value - 1; i++) {
            if (value % i == 0) {
               t = true;
            }
        }
        if (!t) {
            System.out.println("This value is prime number");
        } else {
            System.out.println("This value is not prime number");
        }

    }
}
