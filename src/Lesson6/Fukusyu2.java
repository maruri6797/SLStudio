package Lesson6;

public class Fukusyu2 {
    public static void main(String[] args) {
        String[] students = new String[3];
        students[0] = "鈴木";
        students[1] = "佐藤";
        students[2] = "田中";

        System.out.println(students[0]);
        System.out.println(students[1]);
        System.out.println(students[2]);
        System.out.println(students.length);

        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] + " ");
        }

        System.out.println();

        for (String name : students) {
            System.out.print(name + " ");
        }
    }
}

