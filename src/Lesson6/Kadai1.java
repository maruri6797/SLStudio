package Lesson6;

public class Kadai1 {
    public static void main(String[] args) {
        int[] group = {65, 95, 33, 55};
        int index = group.length - 1;
        for (int i = index; i >= 0; i--) {
            if (i == 0) {
                System.out.print(group[i]);
            } else {
                System.out.print(group[i] + ", ");
            }
        }
    }
}
