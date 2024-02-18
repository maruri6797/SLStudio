package Lesson6;

public class Fukusyu3 {
    public static void main(String[] args) {
        int[][] numbers2d = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        System.out.println(numbers2d[0][0]);
        System.out.println(numbers2d[0][1]);
        System.out.println(numbers2d[0][2]);
        System.out.println(numbers2d[0][3]);
        System.out.println(numbers2d[1][0]);
        System.out.println(numbers2d[1][1]);
        System.out.println(numbers2d[1][2]);
        System.out.println(numbers2d[1][3]);
        System.out.println(numbers2d[2][0]);
        System.out.println(numbers2d[2][1]);
        System.out.println(numbers2d[2][2]);
        System.out.println(numbers2d[2][3]);

        System.out.println(numbers2d[0].length);
        System.out.println(numbers2d[1].length);
        System.out.println(numbers2d[2].length);

        for (int i = 0; i < numbers2d.length; i++) {
            for (int j = 0; j < numbers2d[0].length; j++) {
                System.out.print(numbers2d[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] numbers : numbers2d) {
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
