package _1__waterMoleculeCounter;

// The weight of a water molecule is 3.0 x 10^-23 grams and
// the weight of a liter of water is about 950 grams.
// Write a program that reads the weight of water in liters
// from the input and calculates the number of molecules in it.

import java.util.Scanner;

public class waterMoleculeCounter {
    public static void main(String[] args) {
        double molecule = 3 * Math.pow(10, (-23));
        long liter = 950;

        System.out.println("Please type in the liter amount:");

        long pouredAmount = new Scanner(System.in).nextLong();

        double moleculeCount = pouredAmount * liter / molecule;

        System.out.println("There is " + moleculeCount + " molecules in " + pouredAmount + " liter water.");
    }
}