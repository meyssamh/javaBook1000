package _13__resistance;

// The sum of the resistances r1, r2 and r3 connected 
// in parallel is calculated by a formula. Write a program
// that reads the three resistors from the input and
// calculates the total resistance.

import java.util.Scanner;

public class Resistance {
    public static void main(String[] args) {
        System.out.println("Please enter resistances R1, R2 and R3:");
        
        Scanner scanner = new Scanner(System.in);

        float r1 = scanner.nextFloat();
        float r2 = scanner.nextFloat();
        float r3 = scanner.nextFloat();

        scanner.close();

        float r = (r1 * r2 * r3) / (r1 * r2 + r2 * r3 + r1 * r3);

        System.out.println("The resistance is equal to: " + r + ".");
    }
}