package Lesson3;

public class Lesson3f {
    public static void main(String[] args) {
        int num = 0;
        // num = num + 1と同じ。numは1になる。インクリメント
        num++;
        // num = num + 1と同じ。numは2になる。インクリメント
        num++;
        // num = num + 1と同じ。numは3になる。インクリメント
        num++;
        // num = num - 1と同じ。numは2になる。デクリメント
        num--;

        // 後置ならば処理の後で1を足せばよい
        System.out.println(num);
        num++;

        // 前置ならば処理の前に1を足せばよい
        num++;
        System.out.println(num);

        int num1 = 3;
        num1 += 2; // 2を足す
        num1 += 100; // 100を足す
        num1 -= 2; // 2を引く
        num1 *= 2; // 2をかける
        num1 /= 2; // 2で割る
        // 文字の連結でも使える
        String str = "Hello";
        str += "World";
    }
}
