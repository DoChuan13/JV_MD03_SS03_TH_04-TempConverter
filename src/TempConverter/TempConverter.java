package TempConverter;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Fahrenheit to Celsius.");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Fahrenheit: ");
                    fahrenheit = input.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + fahrenheitToCelsius(fahrenheit));
                    break;

                case 2:
                    System.out.print("Enter Celsius: ");
                    celsius = input.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + celsiusToFahrenheit(celsius));
                    break;

                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice, please select again!!!");
                    break;
            }
        } while (choice != 0);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
