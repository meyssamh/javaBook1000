package _2__ageToSeconds;

// Each year is equal to 3.156 x 10^7 seconds.
// Write a program that takes your age in years and
// converts it to seconds.

import java.util.Scanner;

public class ageToSeconds {
    public static void main(String[] args) {
        double yearInSeconds = 3.156 * Math.pow(10, 7);

        System.out.println("Please type in your age:");

        double ageInSeconds = new Scanner(System.in).nextInt() * yearInSeconds;

        System.out.println("You are " + ageInSeconds + " seconds old!");
    }
}