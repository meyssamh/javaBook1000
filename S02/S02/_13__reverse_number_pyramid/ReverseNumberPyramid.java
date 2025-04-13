package _13__reverse_number_pyramid;

public class ReverseNumberPyramid {
    public static void main(String[] args) {
        for (int i = 1; i < 9; i++) {
            for (int j = 9 - i; j > 0; j--) {
                System.out.printf("%d\t", i);
            }
            System.out.println("");
        }      
    }
}