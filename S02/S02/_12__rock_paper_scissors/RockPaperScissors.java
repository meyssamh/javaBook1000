package _12__rock_paper_scissors;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int scoreOfPlayerOne = 0;
        int scoreOfPlayerTwo = 0;

        int playerOne;
        int playerTwo;

        for (int i = 0; i < 5; i++) {
            playerOne = playerInput(
                    "Player 1 please enter 1:(Rock) 2:(Paper) 3:(Scissors): ",
                    scanner);
            playerTwo = playerInput(
                    "Player 2 please enter 1:(Rock) 2:(Paper) 3:(Scissors): ",
                    scanner);

            if (playerOne == playerTwo) {
                // It's a tie, no score change
            } else if ((playerOne == 1 && playerTwo == 3) ||
                    (playerOne == 2 && playerTwo == 1) ||
                    (playerOne == 3 && playerTwo == 2)) {
                scoreOfPlayerOne++;
            } else {
                scoreOfPlayerTwo++;
            }
        }
        scanner.close();

        printScore(scoreOfPlayerOne, scoreOfPlayerTwo);
    }

    private static int playerInput(String message, Scanner scanner) {
        int input;

        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input >= 1 && input <= 3) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter 1, 2, or 3.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }

        return input;
    }

    private static void printScore(int scoreOfPlayerOne, int scoreOfPlayerTwo) {
        System.out.println("Final Score:");
        System.out.println("Player 1: " + scoreOfPlayerOne);
        System.out.println("Player 2: " + scoreOfPlayerTwo);

        if (scoreOfPlayerOne > scoreOfPlayerTwo) {
            System.out.println("Player 1 wins the game!");
        } else if (scoreOfPlayerTwo > scoreOfPlayerOne) {
            System.out.println("Player 2 wins the game!");
        } else {
            System.out.println("The game is a tie!");
        }
    }
}