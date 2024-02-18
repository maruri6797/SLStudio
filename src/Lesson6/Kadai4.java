package Lesson6;

public class Kadai4 {
    public static void main(String[] args) {
        int[][] groupABC = {
            {65, 95, 33, 50, 46},
            {100},
            {25, 87},
            {65}
        };

        int sum = 0;
        int element = 0;
        // for文のi,jの範囲をgroupABCのlengthに変更する
        for (int i = 0; i < groupABC.length; i++) {
            for (int j = 0; j < groupABC[i].length; j++) {
                sum += groupABC[i][j];
                element++;
            }
        }

        System.out.println("合計：" + sum + "点");
        System.out.println("人数：" + element + "人");

        System.out.println("全生徒平均：" + (sum / element) + "点");
    }
}
