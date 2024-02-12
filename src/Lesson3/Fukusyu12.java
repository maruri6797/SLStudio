package Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fukusyu12 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("1つ目の値を入力してください：");
        String str1 = reader.readLine();
        int number1 = Integer.parseInt(str1);
        System.out.print("2つ目の値を入力してください：");
        String str2 = reader.readLine();
        int number2 = Integer.parseInt(str2);
        System.out.println("計算結果");
        System.out.println(number1 + number2);
        System.out.println(number1 - number2);
        System.out.println(number1 * number2);
        System.out.println((double)number1 / number2);
        System.out.println(number1 % number2);
    }
}

