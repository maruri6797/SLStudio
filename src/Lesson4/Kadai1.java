package Lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kadai1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1~30の数字を入力してください");
        int num = Integer.parseInt(reader.readLine());
        if ( num >= 1 && num <= 30 ) {
            if ( num % 3 == 0 && num % 5 == 0 ) {
                if ( num % 2 == 0 ) {
                    System.out.println(num + "は3でも5でも割り切れる偶数です");
                } else {
                    System.out.println(num + "は3でも5でも割り切れる奇数です");
                }
            } else if ( num % 3 == 0 ) {
                if ( num % 2 == 0 ) {
                    System.out.println(num + "は3で割り切れる偶数です");
                } else {
                    System.out.println(num + "は3で割り切れる奇数です");
                }
            } else if ( num % 5 == 0 ) {
                if ( num % 2 == 0 ) {
                    System.out.println(num + "は5で割り切れる偶数です");
                } else {
                    System.out.println(num + "は5で割り切れる奇数です");
                }
            } else {
                if ( num % 2 == 0 ) {
                    System.out.println(num + "は偶数です");
                } else {
                    System.out.println(num + "は奇数です");
                }
            }
        } else {
            System.out.println(num + "は範囲外の入力です");
        }
    }
}
