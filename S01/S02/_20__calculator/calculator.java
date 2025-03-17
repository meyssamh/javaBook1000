package _20__calculator;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("Please enter two integer numbers:");

        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        scanner.close();

        System.out.printf("%1$s + %2$s = %3$s" + "\n", firstNumber, secondNumber, firstNumber + secondNumber);
        System.out.printf("%1$s x %2$s = %3$s" + "\n", firstNumber, secondNumber, firstNumber * secondNumber);
        System.out.printf("%1$s / %2$s = %3$s" + "\n", firstNumber, secondNumber, (float)firstNumber / secondNumber);
        System.out.printf("%1$s - %2$s = %3$s" + "\n", firstNumber, secondNumber, firstNumber - secondNumber);
        System.out.printf("%1$s %% %2$s = %3$s" + "\n", firstNumber, secondNumber, firstNumber % secondNumber);
    }
}