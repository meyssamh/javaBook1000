package _2__perfectNumberFinder;

import java.util.Scanner;

public class perfectNumberFinder {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userChoice;

        do {
            int number = getUserInput(scanner);
            
            if (isPerfectNumber(number)) {
                System.out.println("The number you entered is perfect!");
            } else {
                System.out.println("The number you entered is not perfect!");
            }

            userChoice = askToContinue(scanner);
            
        } while (userChoice.equalsIgnoreCase("y"));

        scanner.close();
        System.out.println("Thank you for using the program!");
    }

    private static int getUserInput(Scanner scanner) {
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

    private static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    private static String askToContinue(Scanner scanner) {
        System.out.print("Do you want to continue? (y/n): ");
        return scanner.nextLine().trim();
    }
}