package _14__number_pyramid;

public class NumberPyramid {
    public static void main(String[] args) {
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d\t", i);
            }
            System.out.println("");
        }
    }
}