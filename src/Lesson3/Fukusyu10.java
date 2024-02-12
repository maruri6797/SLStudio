package Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fukusyu10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("名前を入力してください：");
        String name = reader.readLine();
        System.out.println("年齢を入力してください：");
        String age = reader.readLine();
        System.out.println("【名前】" + name + "【年齢】" + age + "歳で登録しました。");
    }
}
