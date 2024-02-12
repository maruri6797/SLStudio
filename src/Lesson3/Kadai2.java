package Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kadai2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("目標金額を入力してください");
        int money = Integer.parseInt(reader.readLine());
        System.out.println("目標年数を入力してください");
        int year = Integer.parseInt(reader.readLine());
        System.out.println("目標金額：" + money + "円");
        System.out.println("目標年数：" + year + "年");
        System.out.println("目標貯金額：" + ((double)money / (year * 12)) + "円/月");
    }
}
