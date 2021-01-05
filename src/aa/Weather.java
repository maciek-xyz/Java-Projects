package aa;

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {

        String yes = "yes";
        String no = "no";

        Scanner answer = new Scanner(System.in);
        System.out.println("Is it raining now? ");
        String x = answer.nextLine();

        if (x.equalsIgnoreCase(yes)) {
            System.out.println("Do not forget umbrella!");
        }
        else if (x.equalsIgnoreCase(no)){
                System.out.println("Leave umbrella at home");
            }
        else {
            System.out.println("error");
        }
        }
    }

