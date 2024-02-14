package Lesson4;

public class Fukusyu8 {
    public static void main(String[] args) {
        int action = 1;

        switch (action) {
            case 1: // actionが1の場合は出力する
                System.out.println("たたかう");
                break;
            case 2: // actionが2の場合は出力する
                System.out.println("まほう");
                break;
            case 3: // actionが3の場合は出力する
                System.out.println("どうぐ");
                break;
            default: // actionが1~3以外の場合は出力する
                System.out.println("ぼうぎょ");
                break;
        }
    }
}

