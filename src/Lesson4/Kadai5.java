package Lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kadai5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "SHIFT-JIS"));
        System.out.println("第3問、青森県で生産量日本一の果物といえば？");
        String answer3 = reader.readLine();
        switch (answer3) {
            case "りんご":
                System.out.println("正解！");
                break;
            case "リンゴ":
                System.out.println("正解！");
                break;
            case "林檎":
                System.out.println("正解！");
                break;
            default:
                System.out.println("残念、正解は「りんご」でした");
                break;
        }
        
    }
}

