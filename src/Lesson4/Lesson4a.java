package Lesson4;

public class Lesson4a {
    public static void main(String[] args) {
        int age = 19;
        String message = "お酒は二十歳になってから…";
        if (age >= 20) {
            message = "20歳以上なので飲酒OKです";
        }

        System.out.println(message);
    }
}
