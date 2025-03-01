package _5__annualCost;

// A company manager pays each of his specialists a monthly
// salary of 750,000 Tomans. He wants to know how much the
// company's annual cost will be if he adds 13.5% to each
// specialist's salary. Write a program that reads the number
// of specialists in the company and does this.

import java.util.Scanner;

public class annualCost {
    public static void main(String[] args) {
        long salary = 750000;

        System.out.println("Please enter the number of specialists:");

        int specialistsCount = new Scanner(System.in).nextInt();

        long totalSalaryCosts = salary * specialistsCount * 12;
        double totalHigherSalaryCosts = totalSalaryCosts + totalSalaryCosts * 0.135;

        double costDifference = totalHigherSalaryCosts - totalSalaryCosts;

        System.out.println("Total salary costs is " + totalSalaryCosts +
                " and if the manager raises the salaries the difference will be " + costDifference +
                " with the total salary costs of " + totalHigherSalaryCosts + ".");
    }
}