package Lesson5;

public class Fukusyu9 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 7 == 0) {
                count++;
            }
        }
        System.out.print(count + "個");
    }
}
