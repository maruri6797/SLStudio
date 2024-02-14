package Lesson4;

public class Kadai2 {
    public static void main(String[] args) {
        int number = 21;
        String result = "";

        result = number % 2 == 0 ? "偶数" : number % 3 == 0 ? "3の倍数" : "奇数";
        System.out.println("結果：" + result);
    }
}

