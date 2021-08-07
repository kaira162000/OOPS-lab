import java.util.*;

class Q2 {
    public static void main(String args[]) {
        int a, b;
        Scanner scan = new Scanner(System.in);
        System.out.println("a: ");
        a = scan.nextInt();
        System.out.println("b: ");
        b = scan.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
