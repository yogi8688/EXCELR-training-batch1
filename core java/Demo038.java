package Core_java;

import java.util.Scanner;

public class Demo038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a lowercase character: ");
        char lowerChar = sc.next().charAt(0);

        if (Character.isLowerCase(lowerChar)) {
            char upperChar = Character.toUpperCase(lowerChar);
            System.out.println("Uppercase character: " + upperChar);
        } else {
            System.out.println("Entered character is not in lowercase!");
        }
        sc.close();
    }

}
