package Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson3g {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("割り勘計算機能です。支払金額を入力してください：");
        String input1 = reader.readLine();
        // int inputTotal = Integer.parseInt(input1);
        double inputTotal = Double.parseDouble(input1);

        System.out.print("次に何人で割るか人数を入力してください：");
        String input2 = reader.readLine();
        int inputCount = Integer.parseInt(input2);

        System.out.println("一人の支払金額は" + (inputTotal / inputCount) + "円です");
        // System.out.println("一人の支払金額は" + ((double) inputTotal / inputCount) + "円です");
    }
}
