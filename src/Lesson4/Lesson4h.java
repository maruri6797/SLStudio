package Lesson4;

public class Lesson4h {
    public static void main(String[] args) {
        String season = "冬";

        switch (season) {
            case "春":
                System.out.println("花粉症の季節ですね");
                break;
            case "夏":
                System.out.println("熱中症には気をつけよう");
                break;
            case "秋":
                System.out.println("過ごしやすい季節です");
                break;
            case "冬":
                System.out.println("寒さに負けずに頑張りましょう");
                break;
            default:
                System.out.println("季節が不明です...");
                break;
        }
    }
}
