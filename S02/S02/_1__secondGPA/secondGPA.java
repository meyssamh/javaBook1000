package _1__secondGPA;

// Write a program that reads the student number and
// GPA of N students from the input, finds the student
// with the second highest GPA, and outputs it.

import java.util.Scanner;

public class secondGPA {
    public static void main(String[] args) {
        int firstStudent = -1;
        int secondStudent = -1;

        float firstGpa = -1;
        float secondGpa = -1;

        System.out.println("Please enter the number of students:");

        Scanner scanner = new Scanner(System.in);

        int students = scanner.nextInt();

        if (students < 2) {
            System.out.println("Please enter a number greater than 1!");

            scanner.close();

            return;
        }

        for (int i = 1; i <= students; i++) {
            System.out.println("Please enter the student id number:");

            int id = scanner.nextInt();

            System.out.println("Please enter the GPA of the student:");

            float gpa = scanner.nextFloat();

            if (gpa > firstGpa) {
                secondStudent = firstStudent;
                secondGpa = firstGpa;
                firstGpa = gpa;
                firstStudent = id;
            } else if (gpa > secondGpa) {
                secondGpa = gpa;
                secondStudent = id;
            }
        }

        scanner.close();

        System.out.println("The student with the second highest GPA hasid number of "
                + secondStudent + " and GPA of " + secondGpa + ".");
    }
}