import java.util.Scanner;

public class demo7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your name:");
        String name=sc.nextLine();

    
        System.out.println("enter your age:");
        int age=sc.nextInt();

    
        System.out.println("enter your phone:");
        long phone=sc.nextLong();

        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("phone: " + phone);
      }
   }