package Lesson4;

public class Lesson4f {
    public static void main(String[] args) {
        int math = 100;
        int science = 31;
        if ( math <= 30 || science <= 30 ) {
            System.out.println("補修です");
        } else if ((math >= 80 && science >= 80) || math == 100 || science == 100 ) {
            System.out.println("おめでとう");
        } else {
            System.out.println("次も頑張りましょう");
        }
    }
}
