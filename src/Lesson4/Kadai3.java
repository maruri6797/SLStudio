package Lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kadai3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("秒数を入力してください");
        int seconds = Integer.parseInt(reader.readLine());
        int day = 0;
        int hour = 0;
        int minutes = 0;
        int sec = 0;
        
        if ( seconds >= 60 ) {
            sec = seconds % 60;
            minutes = seconds / 60;
            if (minutes > 60 ) {
                hour = minutes / 60;
                minutes %= 60;
                if (hour > 24 ) {
                    day = hour / 24;
                    hour %= 24;
                }
            }
        } else {
            sec = seconds;
        }
        System.out.println(seconds + "は" + day + "日" + hour + "時間" + minutes + "分" + sec + "秒です");
        
        
        // int second = seconds % 60;
        // int minute = (seconds / 60) % 60;
        // int hours = (seconds / 3600) % 24;
        // int days = seconds / (3600 * 24);
    }
}
