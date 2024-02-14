package Lesson4;

public class Fukusyu3 {
    public static void main(String[] args) {
        int score = 111;

        // scoreが90以上、100以下の場合は出力する
        // if ( score >= 90 && score <= 100 ) {
        //     System.out.println("A");
        // } else if ( score >= 80 && score < 90 ) { // scoreが80以上、90未満の場合は出力する
        //     System.out.println("B");
        // } else if ( score >= 70 && score < 80 ) { // scoreが70以上、80未満の場合は出力する
        //     System.out.println("C");
        // } else if ( score >= 60 && score < 70 ) { // scoreが60以上、70未満の場合は出力する
        //     System.out.println("D");
        // } else if ( score >= 0 && score < 60 ) { // scoreが0以上、60未満の場合は出力する
        //     System.out.println("F");
        // } else { // scoreが0~100以外の場合は出力する
        //     System.out.println("無効な点数です");
        // }

        if ( score >= 0 && score < 60 ) {
            System.out.println("F");
        } else if ( score < 70 ) {
            System.out.println("D");
        } else if ( score < 80 ) {
            System.out.println("C");
        } else if ( score < 90 ) {
            System.out.println("B");
        } else if ( score <= 100 ) {
            System.out.println("A");
        } else {
            System.out.println("無効な点数です");
        }
    }
}
