package aa;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.println("Input first number: ");
        int firstValue = value.nextInt();

        System.out.println("Input second number: ");
        int secondValue = value.nextInt();

        int plus = firstValue + secondValue;
        int minus = firstValue - secondValue;
        int multi = firstValue * secondValue;
        int divide = firstValue/secondValue;
        int rest = firstValue % secondValue;

        System.out.println(firstValue + "+" + secondValue + "=" + plus);
        System.out.println(firstValue + "-" + secondValue + "=" + minus);
        System.out.println(firstValue + "*" + secondValue + "=" + multi);
        System.out.println(firstValue + "/" + secondValue + "=" + divide);
        System.out.println(firstValue + " mod " + secondValue + "=" + rest);

    }
}
