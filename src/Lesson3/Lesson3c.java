package Lesson3;

public class Lesson3c {
    public static void main(String[] args) {
        // シングルクォーテーションでくくる
        char c1 = 'A';

        // ダブルクォーテーションなのでこれはダメ
        char c2 = "A"; // エラー

        // 2文字以上なのでダメ
        char c3 = '10'; // エラー
    }
}
