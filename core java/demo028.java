import java.util.Scanner;

public class demo028 {
                public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number of terms in Fibonacci series: ");
                int n = sc.nextInt();
                
                System.out.print("Fibonacci series up to " + n + " terms: ");
                for (int i = 0; i < n; i++) {
                    System.out.print(fibonacci(i) + " ");
                }
                sc.close();
            }
            public static int fibonacci(int n) {
                if (n <= 1) {
                    return n; 
                }
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }
