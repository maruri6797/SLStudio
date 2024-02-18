package Lesson6;

public class Fukusyu6 {
    public static void main(String[] args) {
        String[][] fruits = {
            {"apple", "pear", "loquat"},
            {"peach", "plum", "apricot", "cherry", "dates"},
            {"orange", "lemon", "lime", "yuzu"}
        };

        System.out.println(fruits[0][0]);
        System.out.println(fruits[0][1]);
        System.out.println(fruits[0][2]);
        System.out.println(fruits[1][0]);
        System.out.println(fruits[1][1]);
        System.out.println(fruits[1][2]);
        System.out.println(fruits[1][3]);
        System.out.println(fruits[1][4]);
        System.out.println(fruits[2][0]);
        System.out.println(fruits[2][1]);
        System.out.println(fruits[2][2]);
        System.out.println(fruits[2][3]);

        System.out.println(fruits[0].length);
        System.out.println(fruits[1].length);
        System.out.println(fruits[2].length);

        for (int i = 0; i < fruits.length; i++) {
            for (int j = 0; j < fruits[i].length; j++) {
                System.out.print(fruits[i][j] + " ");
            }
            System.out.println();
        }

        for (String[] fruit : fruits) {
            for (String f : fruit) {
                System.out.print(f + " ");
            }
            System.out.println();
        }
    }
}

