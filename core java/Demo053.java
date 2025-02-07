import java.util.Scanner;

public class Demo053 {
    public static int factorial(int n){
        int fact =1;
        for(int i=1;i<=n;i++){
            fact*=1;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int originalNumber=n;
        int sumOfFactprials=0;
        while(n!=0){
            int digit =n%10;
            sumOfFactprials+=factorial(digit);
            n/=10;
        }
        if(sumOfFactprials==originalNumber){
            System.out.println(originalNumber+" is a strong number");

        }
        else {
            System.out.println(originalNumber+" is not a strong number");
        }
        sc.close();
    }
}
