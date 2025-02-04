package Core_java;

import java.util.Scanner;

public class Demo045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping without using a third variable
        a = a + b; 
        b = a - b; 
        a = a - b; 

        System.out.println("After swapping: a = " + a + ", b = " + b);

        scanner.close();
    }
}

