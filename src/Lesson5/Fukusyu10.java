package Lesson5;

public class Fukusyu10 {
    public static void main(String[] args) {
        for (int i = 100; i > 0; i--) {
            int number = i - 1;
            if (number % 5 == 0) {
                System.out.print(number);
                break;
            }
        }
    }
}

