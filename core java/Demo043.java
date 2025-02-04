package Core_java;

import java.util.Scanner;

public class Demo043 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a char:");
            char c = sc.next().charAt(0);

            char lower;
            if (Character.isUpperCase(c)) {
                lower = Character.toLowerCase(c);
            } else {
                lower = c;
            }

            System.out.println("Lowercase of " + c + " char: " + lower);
        }
    }
}
