package Lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson6a {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        System.out.println("最大5件のテストの平均点を計算します。");

        int totalScore = 0;
        while (count < 5) {
            count++;
            System.out.println(count + "人目の点数を入力してください(0 - 100)");

            String inputScore = reader.readLine();
            int score = Integer.parseInt(inputScore);
            if (score < 0 || score > 100) {
                count--;
                break;
            }

            totalScore += score;
        }

        double average = 0;
        if (count > 0) {
            average = (double) totalScore / count;
        }
        System.out.println(count + "人の平均は" + average + "です");
    }
}
