package aa;

import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What the light? ");
        String light = scanner.nextLine();


        switch (light) {
            case "green":
                System.out.println("Go!");
                break;
            case "yellow":
                System.out.println("Stop!");
                break;
            case "red":
                System.out.println("Stop!");
                break;
            case "red + yellow":
                System.out.println("Get ready to go!");
                break;

        }


    }

}
