package _4__inflationRate;

// Write a program that reads the price of a commodity
// in the previous and current year, prints the inflation rate
// and the price for the next year. The inflation rate should be
// calculated as a percentage (for example, 6.5%).

import java.util.Scanner;

public class inflationRate {
    public static void main(String[] args) {
        System.out.println("Please type in the price of a commodity in the previous and current year:");

        Scanner scanner = new Scanner(System.in);

        double previousYear = scanner.nextDouble();
        double currentYear = scanner.nextDouble();

        scanner.close();

        double inflationRate = (currentYear - previousYear) / previousYear;
        double nextYear = currentYear + currentYear * inflationRate;

        System.out.println("The inflation rate is " + inflationRate * 100 +
                "% and the price for the next year is " + nextYear + ".");
    }
}