public class Demo054 {
        // Overloaded method with one parameter
    public static int add(int a) {
        return a;
    }
    
        // Overloaded method with two parameters
    public static int add(int a, int b) {
        return a + b;
    }
    
        // Overloaded method with three parameters
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public static void main(String[] args) {
        System.out.println("Add one number: " + add(5));          // Calls the method with one parameter
        System.out.println("Add two numbers: " + add(5, 10));     // Calls the method with two parameters
        System.out.println("Add three numbers: " + add(5, 10, 15)); // Calls the method with three parameters
    }
    
}
