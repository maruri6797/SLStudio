package Lesson6;

public class Lesson6g {
    public static void main(String[] args) {
        int[][] array2D = {
            // 横
            //0, 1, 2, 3   // 縦
            { 1, 2, 3, 4 }, // 0
            { 5, 6, 7, 8 }, // 1
            { 9, 0, 1, 2 }, // 2
        };

        int num1 = array2D[1][2];
        System.out.print(num1);
    }
}

