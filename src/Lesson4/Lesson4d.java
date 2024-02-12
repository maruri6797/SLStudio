package Lesson4;

public class Lesson4d {
    public static void main(String[] args) {
        String season = "秋";

        if ( season.equals("春") ) {
            System.out.println("花粉症の季節ですね");
        } else if ( season.equals("夏") ) {
            System.out.println("熱中症には気をつけよう");
        } else if ( season.equals("秋") ) {
            System.out.println("過ごしやすい季節です");
        } else if ( season.equals("冬") ) {
            System.out.println("寒さに負けずに頑張りましょう");
        } else if ( season.equals("春") ) {
            System.out.println("実行されません！！！");
        } else {
            System.out.println("季節が不明です...");
        }
    }
}
