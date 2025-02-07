import java.util.Scanner;
public class Demo052 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNumber=num;
        int result=0;
        int numberOfDigits = String.valueOf(num).length();
        while(num!=0) {
            int remainder = num % 10;
            result += Math.pow(remainder, numberOfDigits);
            num /= 10;
        }
        if (originalNumber == result) {
            System.out.println(originalNumber + " is an Armstrong number.");
            
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
        sc.close();
    }
}
