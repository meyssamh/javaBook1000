package _17__cost_calculator;

// A company uses 150 pens and 50 packs of paper annually.
// At the end of the year, the company wants to know how much the
// cost of this part of office equipment will increase next year.
// Write a program that recieves the price of these items an input
// this year, also recieves the inflation rate for next year,
// calculates the company's added cost in this part and outputs it.
// The inflation is entered as a percentage, which the program must
// convert to a decimal value.

import java.util.Scanner;

public class CostCalculator {
    public static void main(String[] args) {
        System.out.println("Please enter the price of the pens:");
        
        Scanner scanner = new Scanner(System.in);
        
        float penPrice = scanner.nextFloat();
        
        System.out.println("Please enter the price of the A4:");

        float a4Price = scanner.nextFloat();

        System.out.println("Please enter the inflation rate of the next year:");

        float inflationRate = scanner.nextFloat();

        scanner.close();

        float cost = 150 * penPrice * inflationRate / 100 + 50 * a4Price * inflationRate / 100;

        System.out.println("The extra cost in the next year is equal to " + cost + ".");
    }
}