package _19__distanceClaculator;

import java.util.Scanner;

public class distanceCalculator {
    public static void main(String[] args) {
        System.out.println("Please enter the consumption of the vehicle in 100 kilometers:");

        Scanner scanner = new Scanner(System.in);

        float consumption = scanner.nextFloat();

        System.out.println("Please enter the capacity of the tank of the vehicle:");

        float tankCapacity = scanner.nextFloat();

        scanner.close();

        float distance = tankCapacity * 100 / consumption;

        System.out.println("The vehicle can drive " + distance + " kilometers with a tank full of gas!");
    }
}