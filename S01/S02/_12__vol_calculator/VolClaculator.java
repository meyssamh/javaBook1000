package _12__vol_calculator;

// Write a program that reads two numbers from the input
// (the first number represents the resistance of an electrical
// circuit and the second number represents its current) and
// alculates and displays the voltage using the following formula.
// Current * Resistance = Voltage

import java.util.Scanner;

public class VolClaculator {
    public static void main(String[] args) {
        System.out.println("Please enter Resistance and Current:");

        Scanner scanner = new Scanner(System.in);

        int resistance = scanner.nextInt();
        int current = scanner.nextInt();

        scanner.close();

        int voltage = current * resistance;

        System.out.println("The voltage based on those numbers is equal to " + voltage + ".");
    }
}