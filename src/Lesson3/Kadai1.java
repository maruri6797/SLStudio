package Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kadai1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("三角形の面積を計算します");
        System.out.println("底辺を入力してください(cm):");
        String str1 = reader.readLine();
        int num1 = Integer.parseInt(str1);
        System.out.println("高さを入力してください(cm):");
        String str2 = reader.readLine();
        int num2 = Integer.parseInt(str2);
        System.out.println("面積は" + ((double)num1 * num2 / 2) + "平方センチメートルです");
    }
}

