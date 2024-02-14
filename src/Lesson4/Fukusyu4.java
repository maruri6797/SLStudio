package Lesson4;

public class Fukusyu4 {
    public static void main(String[] args) {
        int number = 25;

        // numberが2で割っても3で割っても割り切れる場合は出力する
        if ( number % 2 == 0 && number % 3 == 0 ) {
            System.out.println(number + "は2の倍数かつ3の倍数です");
        }
    }
}
