import java.util.*;

class Q2 {
    public static void main(String args[]) {
        double a, b;
        Scanner scan = new Scanner(System.in);
        System.out.println("a: ");
        a = scan.nextDouble();
        System.out.println("b: ");
        b = scan.nextDouble();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}