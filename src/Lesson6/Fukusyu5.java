package Lesson6;

public class Fukusyu5 {
    public static void main(String[] args) {
        int[][] scores = {
            {93, 20, 45},
            {100, 39, 4, 50, 5},
            {45, 4}
        };

        System.out.println(scores[0][0]);
        System.out.println(scores[0][1]);
        System.out.println(scores[0][2]);
        System.out.println(scores[1][0]);
        System.out.println(scores[1][1]);
        System.out.println(scores[1][2]);
        System.out.println(scores[1][3]);
        System.out.println(scores[1][4]);
        System.out.println(scores[2][0]);
        System.out.println(scores[2][1]);

        System.out.println(scores[0].length);
        System.out.println(scores[1].length);
        System.out.println(scores[2].length);

        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] score : scores) {
            for (int s : score) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}

