package aa;

import java.util.Scanner;

public class InputCheck {
    public static void main(String[] args) {
        String exit = "exit";
        String text;
        Boolean x;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please, input text: ");
            text = scanner.nextLine();

        } while (!text.equalsIgnoreCase(exit));
    }
}
