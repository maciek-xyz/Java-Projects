package aa;

import java.util.Scanner;

public class Triangle1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, input first value: ");
        int firstValue = scanner.nextInt();

        System.out.println("Please, input second value: ");
        int secondValue = scanner.nextInt();

        System.out.println("Please, input third value: ");
        int thirdValue = scanner.nextInt();

       if (firstValue < secondValue + thirdValue && secondValue < firstValue + thirdValue &&
               thirdValue < firstValue + secondValue) {
           System.out.println("With this values we can bulid triangle");
       } else {
           System.out.println("With this values we can't bulid triangle");
       }
    }
}
