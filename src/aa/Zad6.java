package aa;

import java.util.Scanner;
public class Zad6 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Please, input the number: ");
        double x = number.nextDouble();
        double result = Math.pow(x,3);
        System.out.println("Result is: "+result);
    }
}
