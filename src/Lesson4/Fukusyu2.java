package Lesson4;

public class Fukusyu2 {
    public static void main(String[] args) {
        int score = 30;

        // scoreが80以上の場合は出力する
        if ( score >= 80 ) {
            System.out.println("A");
        } else if ( score >= 50 ) { // scoreが50以上の場合は出力する
            System.out.println("B");
        } else { // それ以外の場合に出力する
            System.out.println("C");
        }
    }
}
