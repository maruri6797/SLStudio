package Lesson5;

public class Lesson5c {
    public static void main(String[] args) {
        int i = 0;

        while (true) {
            i++;
            if (i > 100) {
                break;
            }

            if (i == 11 || i == 22 || i == 33 || i == 44 || i == 55 || i == 66 || i == 77 || i == 88 || i == 99) {
                continue;
            }
            System.out.println("値は" + i + "です");
        }
    }
}
