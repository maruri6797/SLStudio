package Lesson6;

public class Lesson6i {
    public static void main(String[] args) {
        int[][] array2D = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 0, 1, 2},
        };

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(array2D[row][col]);
            }
            System.out.println();
        }
    }
}
