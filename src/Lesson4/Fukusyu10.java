package Lesson4;

public class Fukusyu10 {
    public static void main(String[] args) {
        String name = "佐藤";
        String message = "";

        // nameが佐藤と一致した場合、messageにこんにちはを代入する
        if ( name.equals("佐藤") ) {
            message = "こんにちは！";
        }
        System.out.println(message);
    }
}

