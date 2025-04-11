package _11__number_pyramid;

public class NumberPyramid {
    public static void main(String[] args) {
        for (int i = 7; i > 0; i--) {
            for(int j = i; j > 0; j-- ) {
                System.out.printf("%d \t", j); 
            }
            System.out.printf("\n");
        }
    }
}