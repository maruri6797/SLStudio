package Lesson6;

public class Lesson6p {
    public static void main(String[] args) {
        int[][] jagged = new int[3][];
        jagged[0] = new int[]{ 1, 2 };
        jagged[1] = new int[]{ 3, 4, 5, 6, 7, 8 };
        jagged[2] = new int[]{ 9 };

        int[][] jaggedInitialized = {
            { 1, 2 },
            { 3, 4, 5, 6, 7, 8 },
            { 9 }
        };

        for (int[] array : jaggedInitialized) {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
