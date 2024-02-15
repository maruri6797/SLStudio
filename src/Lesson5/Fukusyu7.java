package Lesson5;

public class Fukusyu7 {
    public static void main(String[] args) {
        int i = 0;
        int count = 0;
        while (i <= 100) {
            i++;
            if (i % 2 == 0 && i % 3 == 0) {
                count++;
            }
        }
        System.out.println(count + "個");
    }
}
