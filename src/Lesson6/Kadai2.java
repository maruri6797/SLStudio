package Lesson6;

public class Kadai2 {
    public static void main(String[] args) {
        int[] group = {65, 95, 33, 70};
        int sum = 0;
        for (int i = 0; i < group.length; i++) {
            sum += group[i];
        }
        System.out.println("合計：" + sum + "点");
    }
}
