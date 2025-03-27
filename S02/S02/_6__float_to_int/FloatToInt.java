package _6__float_to_int;

import java.util.Scanner;

public class FloatToInt {
    public static void main(String[] args) {

        String enteredNumber = getUserInput();

        int decimalIndex = findDecimalSeparator(enteredNumber);
        if (decimalIndex == -1) {
            System.out.println("Invalid input! Please enter a valid floating-point number.");
            return;
        }

        int integerPart = parseIntegerPart(enteredNumber, 0, decimalIndex);
        int fractionalPart = parseIntegerPart(enteredNumber, decimalIndex + 1, enteredNumber.length());

        printOutput(integerPart, fractionalPart);
    }

    public static String getUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a float number:");
        String enteredNumber = scanner.nextLine();

        scanner.close();
        return enteredNumber;
    }

    public static Integer findDecimalSeparator(String input) {
        int dotIndex = input.indexOf(".");
        int commaIndex = input.indexOf(",");

        if (dotIndex != -1) {
            return dotIndex;
        } else if (commaIndex != -1) {
            return commaIndex;
        }
        return -1;
    }

    public static Integer parseIntegerPart(String input, int start, int end) {
        try {
            return Integer.parseInt(input.substring(start, end));
        } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid number format.");
            System.exit(1);
            return 0;
        }
    }

    public static void printOutput(int integerPart, int fractionalPart) {
        System.out.printf("The integer part is %d and the fractional part is %d.%n",
                integerPart,
                fractionalPart);
    }
}