public class Demo14 {
    public static void main(String[] args) {
        int x = 10;

        System.out.println("X: "+x);

        System.out.println("Unary Plus: "+(+x));
        System.out.println("Unary Minus: "+(-x));

        System.out.println("X: "+x);
        System.out.println("Pre Increment: "+(++x));
        System.out.println("Post Increment: "+(x++));

        System.out.println("X: "+x);
        System.out.println("Pre Decrement: "+(--x));
        System.out.println("Post Decrement: "+(x--));

        boolean b = true;
        System.out.println("Original boolean value: " + b);
        System.out.println("Logical NOT: " + (!b));

    }
}