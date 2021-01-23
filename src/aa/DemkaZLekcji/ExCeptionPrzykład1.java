package aa.DemkaZLekcji;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExCeptionPrzykład1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        double x = scanner.nextDouble();

        try {
            Math.sqrt(x);
        }
        catch (Exception e) {
            System.out.println("Input correct number");
        }

        System.out.println(Math.sqrt(x));

    }
}
