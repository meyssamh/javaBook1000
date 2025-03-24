package _14__kilogram_to_gram;

// Write a program that receives the weight of
// an item in kilograms and displays its weight
// in grams. One kilogram is equal to 1000 grams.

import java.util.Scanner;

public class KilogramToGram {
    public static void main(String[] args) {
        System.out.println("Please enter the weight of the item in kilogram:");

        Scanner scanner = new Scanner(System.in);

        float weightInKg = scanner.nextFloat();

        scanner.close();

        float weightInG = weightInKg * 1000;

        System.out.println("The item weights " + weightInG + " gram.");
    }
}