package _17__triangle;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        System.out.println("Welcome! This program checks if three numbers can form a triangle.");
        Scanner scanner = new Scanner(System.in);

        int firstSide = readSide("first", scanner);
        int secondSide = readSide("second", scanner);
        int thirdSide = readSide("third", scanner);

        if (canFormTriangle(firstSide, secondSide, thirdSide)) {
            System.out.println("Yes! These sides can form a triangle.");
        } else {
            System.out.println("No, these sides cannot form a triangle.");
        }

        scanner.close();
    }

    private static int readSide(String sideName, Scanner scanner) {
        int side = 0;

        while (true) {
            System.out.printf("Enter the %s side (positive integer): ", sideName);
            if (scanner.hasNextInt()) {
                side = scanner.nextInt();
                if (side > 0) {
                    break;
                } else {
                    System.out.println("Side must be a positive number. Try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }

        return side;
    }

    private static boolean canFormTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }
}
