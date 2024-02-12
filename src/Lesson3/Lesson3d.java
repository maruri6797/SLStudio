package Lesson3;

public class Lesson3d {
    public static void main(String[] args) {
        // メインメソッド内
        String s1 = "SLスタジオ、SLスタジオ";
        // 何番目の文字かを調べる
        System.out.println(s1.indexOf("ス")); // 2 と表示される

        // 1文字じゃなくても良い
        System.out.println(s1.indexOf("ジオ")); // 4 と表示される

        // 文字の長さを調べる
        String s2 = "SLスタジオ";
        System.out.println(s2.length()); // 6と表示される

        // 大文字・小文字に変換する
        String s3 = "SL Studio";
        System.out.println(s3.toUpperCase()); // SL STUDIO と表示される
        System.out.println(s3.toLowerCase()); // sl studio と表示される

        // SLスタジオへようこそ
        String str1 = "SLスタジオへようこそ";
        System.out.println(str1);

        // "SLスタジオ"へようこそ
        str1 = "\"SLスタジオ\"へようこそ";
        System.out.println(str1);

        // SLスタジオ
        // へようこそ
        str1 = "SLスタジオ\nへようこそ";
        System.out.println(str1);

        // SLスタジオ   へようこそ
        str1 = "SLスタジオ\tへようこそ";
        System.out.println(str1);
    }
}
