package _9__odd_even_finder;

// Write a program that reads a number, if the number is even,
// it will print Even otherwise it will print Odd. To solve this 
// problem, use ? and % operators. In this program, the recieved
// number is placed in the num variable.

import java.util.Scanner;

public class OddEvenFinder {
    public static void main(String[] args) {
        System.out.println("Please enter a number:");

        try(Scanner scanner = new Scanner(System.in)) {
            int num = scanner.nextInt();

            String situation = num % 2 == 0 ? "Even" : "Odd";

            System.out.println("The entered number(" + num + ") is " + situation + ".");
        }
    }
}