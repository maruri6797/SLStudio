package Lesson4;

public class Fukusyu5 {
    public static void main(String[] args) {
        int number = 48;

        // numberが5または7で割り切れる場合は出力する
        if ( number % 5 == 0 || number % 7 == 0 ) {
            System.out.println(number + "は5の倍数もしくは7の倍数です");
        }
    }
}

