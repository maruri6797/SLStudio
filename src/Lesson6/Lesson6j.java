package Lesson6;

public class Lesson6j {
    public static void main(String[] args) {
        int[][] array2D = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 0}
        };

        int rowSize = array2D.length; // 2
        int colSize = array2D[0].length; // 5

        System.out.println("rowSize: " + rowSize);
        System.out.println("colSize: " + colSize);
    }
}

