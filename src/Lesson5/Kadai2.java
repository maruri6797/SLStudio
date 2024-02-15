package Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kadai2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean loop = true;
        while (loop) {
            System.out.print("Enter the password:");
            String inputPassword = reader.readLine();
            if (inputPassword.equals("slstudio-password")) {
                System.out.println("Password is correct. Access granted!");
                loop = false;
            } else {
                System.out.println("Incorrect password. Please try again.");
            }
        }
    }
}
