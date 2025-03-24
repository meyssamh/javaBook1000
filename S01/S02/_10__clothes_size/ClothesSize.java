package _10__clothes_size;

// Write a program that reads the height, weight and the age of
// a person and calculated the size of his clothes as follows:
// - Waist circumference increase coefficient for ages over 28,
// one coefficient every two years
// - Coat increase coefficient for ages over 30, one coefficient every two years
// - Waist size equals weight divided by 5.7, plus 0.1 times the coat increase
// - The circumference of the coat is equal to weight * height, plus 1 divided
// by 8 times the coat increase.
// - Hat size equals weight * 2.9, divided by height

import java.util.Scanner;

public class ClothesSize {
    public static void main(String[] args) {
        System.out.println("Please enter height, weight and age:");

        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        float weight = scanner.nextFloat();
        int age = scanner.nextInt();

        scanner.close();

        int waistCoefficient = (age > 28) ? (age - 28) / 2 : 0;
        int coatCoefficient = (age > 30) ? (age - 30) / 10 : 0;

        double hatSize = weight * 2.9 / height;
        double coatSize = weight * height + 1.0 / 8 * coatCoefficient;
        double waistSize = weight / 5.7 + 0.1 / 10 * waistCoefficient;

        System.out.println("Your hat size is equal to " + hatSize +
                ", your coat size is equal to " + coatSize +
                " and your waist size is equal to " + waistSize + ".");
    }
}