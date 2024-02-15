package Lesson5;

public class Fukusyu8 {
    public static void main(String[] args) {
        int i = 100;
        while(i > 0) {
            i--;
            if (i % 7 == 0) {
                break;
            }
        }
        System.out.print(i);
    }
}

