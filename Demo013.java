import java.util.Scanner;

public class Demo013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base: ");
        int b = sc.nextInt();
        
        System.out.println("Enter height: ");
        int h = sc.nextInt();

        double area = (0.5*b*h);
        
        System.out.println("Area of the triangle: " + area);

    }
}