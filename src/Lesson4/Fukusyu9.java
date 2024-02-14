package Lesson4;

public class Fukusyu9 {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int sum = 0;

        // xの値がyよりも大きい場合は引き算する
        if (x > y) {
            sum = x - y;
        } else { // xの値がyよりも小さい場合は足し算する
            sum = x + y;
        }

        System.out.println("sum : " + sum);
    }
}
