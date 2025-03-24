package _3__fibonacci;

import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        System.out.println("How many fibonnaci numbers should I produce?");

        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        scanner.close();
        
        if (amount <= 0) {
            System.out.println("Please enter a positive integer!");
            return;    
        }
        
                int firstNumber = 0;
                int secondNumber = 1;
        
        System.out.println("Fibonnaci numbers:");

        System.out.print(firstNumber);

        if (amount > 1) {
            System.out.print(" " + secondNumber);
        } 
        
        if (amount > 2) {
            printFibonacciSequence(firstNumber, secondNumber, amount);
        }
    }
    
    private static void printFibonacciSequence(int firstNumber, int secondNumber, int amount) {
        int lastNumber;

        for (int i = 2; i < amount; i++) {       
            lastNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = lastNumber;
            System.out.print(" " + lastNumber);
        }
    }
}