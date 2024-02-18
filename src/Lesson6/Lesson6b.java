package Lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson6b {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        System.out.println("最大5件のテストの平均点を計算します。");

        int score1 = 0;
        int score2 = 0;
        int score3 = 0;
        int score4 = 0;
        int score5 = 0;

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

            switch (count) {
                case 1:
                    score1 = score;
                    break;
                case 2:
                    score2 = score;
                    break;
                case 3:
                    score3 = score;
                    break;
                case 4:
                    score4 = score;
                    break;
                case 5:
                    score5 = score;
                    break;
            }
        }

        double average = 0;
        if (count > 0) {
            average = (double) totalScore / count;
        }

        for (int i = 0; i < count; i++) {
            int score = 0;
            switch (i) {
                case 0:
                    score = score1;
                    break;
                case 1:
                    score = score2;
                    break;
                case 2:
                    score = score3;
                    break;
                case 3:
                    score = score4;
                    break;
                case 4:
                    score = score5;
                    break;
            }
            System.out.println((i + 1) + "人目の点数は" + score + "でした");
        }
        System.out.println(count + "人の平均は" + average + "です");
    }
}

