package Lesson6;

public class Kadai3 {
    public static void main(String[] args) {
        int[] group = {65, 95, 33, 79};
        int sum = 0;
        for (int g : group) {
            sum += g;
        }
        // for (int i = 0; i < group.length; i++) {
        //     sum += group[i];
        // }
        double average = (double)sum / group.length;
        System.out.println("平均：" + average + "点");
    }
}
