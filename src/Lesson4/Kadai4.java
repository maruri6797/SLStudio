package Lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kadai4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "SHIFT-JIS"));
        System.out.println("第一問、富士山の標高は何メートルでしょう？");
        int answer1 = Integer.parseInt(reader.readLine());
        int count = 0;
        if ( answer1 == 3776 ) {
            System.out.println("正解！");
            count++;
        } else {
            System.out.println("残念、正解は3776(m)でした");
        }
        System.out.println("第二問、「縮緬雑魚」なんと読む？");
        String answer2 = reader.readLine();
        if ( answer2.equals("ちりめんじゃこ") ) {
            System.out.println("正解！");
            count++;
        } else {
            System.out.println("残念、正解は「ちりめんじゃこ」でした");
        }
        System.out.println(count + "/2問正解しました");
    }
}
