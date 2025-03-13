package _18_accelerationCalculator;

// A cyclist travels at a speed of x km/h and after
// n minutes his speed reaches k km/h. Write a program
// to calculate his acceleration.

import java.util.Scanner;

public class accelerationCalculator {
    public static void main(String[] args) {
        System.out.println("Please enter the final speed:");

        Scanner scanner = new Scanner(System.in);

        float finalSpeed = scanner.nextFloat();

        System.out.println("Please enter the starting speed:");

        float startingSpeed = scanner.nextFloat();

        System.out.println("Please enter the travel duration:");

        float travelDuration = scanner.nextFloat();

        scanner.close();

        float acceleration = (finalSpeed - startingSpeed) * 60 / travelDuration;

        System.out.println("The acceleration is equal to " + acceleration + ".");
    }
}