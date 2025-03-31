package _9__price_calculator;

import java.util.Scanner;

public class PriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float initialPrice = getValidatedInput(scanner, "Enter price of the product:");
        float inflationRate = getValidatedInput(scanner, "Enter the inflation value:");
        int years = getValidatedInputYear(scanner, "Enter the number of years for calculation:");

        scanner.close();

        calculateAndPrintFuturePrices(initialPrice, inflationRate, years);
    }

    private static float getValidatedInput(Scanner scanner, String message) {
        System.out.println(message);
        while (!scanner.hasNextFloat()) {
            System.out.println("Invalid input. Please enter a valid number:");
            scanner.next();
        }
        return scanner.nextFloat();
    }

    private static int getValidatedInputYear(Scanner scanner, String message) {
        System.out.println(message);
        while (true) {
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                if (value > 0) {
                    return value;
                }
            } else {
                scanner.next();
            }
            System.out.println("Invalid input. Please enter a valid positive number:");
        }
    }

    private static void calculateAndPrintFuturePrices(float price, float inflation, int years) {
        for (int i = 1; i <= years; i++) {
            price = calculateFuturePrice(price, inflation);
            System.out.printf("Price of the product after %d year(s) is: %.2f%n", i, price);
        }
    }

    private static float calculateFuturePrice(float price, float inflation) {
        return price + (price * inflation / 100);
    }
}