package Lesson6;

public class Fukusyu4 {
    public static void main(String[] args) {
        String[][] student2d = {
            {"Ethan", "Olivia", "Noah"},
            {"Emma", "Jackson", "Aiden"},
            {"Liam", "Ava", "Sophia"}
        };

        System.out.println(student2d[0][0]);
        System.out.println(student2d[0][1]);
        System.out.println(student2d[0][2]);
        System.out.println(student2d[1][0]);
        System.out.println(student2d[1][1]);
        System.out.println(student2d[1][2]);
        System.out.println(student2d[2][0]);
        System.out.println(student2d[2][1]);
        System.out.println(student2d[2][2]);

        System.out.println(student2d[0].length);
        System.out.println(student2d[1].length);
        System.out.println(student2d[2].length);

        for (int i = 0; i < student2d.length; i++) {
            for (int j = 0; j < student2d[i].length; j++) {
                System.out.print(student2d[i][j] + " ");
            }
            System.out.println();
        }

        for (String[] students : student2d) {
            for (String student : students) {
                System.out.print(student + " ");
            }
            System.out.println();
        }
    }
}
