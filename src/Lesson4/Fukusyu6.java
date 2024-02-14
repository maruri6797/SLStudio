package Lesson4;

public class Fukusyu6 {
    public static void main(String[] args) {
        String password = "mySecretPassword";
        // passwordが"mySecretPassword"の場合はログインしました、一致しない場合はパスワードが違います、をresultに格納
        String result = password.equals("mySecretPassword") ? "ログインしました" : "パスワードが違います";
        System.out.println(result);
    }
}

