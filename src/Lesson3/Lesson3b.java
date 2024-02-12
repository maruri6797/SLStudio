package Lesson3;

public class Lesson3b {
    public static void main(String[] args) {
        byte b = 127;
        short s = -32768;
        int i = -2147483648;
        long l = 9223372036854775807l;
        int number = 1_234_567_890;

        // fを付けないとdouble型と判断される
        float f = 3.14f;
        // dをわざわざ付けてもいいが、省略可能
        double d = 10.0;

        // intとdoubleの計算結果はdoubleになる
        double answer = d * 100;
        // これはエラー
        int answer2 = d * 100;
    }
}

