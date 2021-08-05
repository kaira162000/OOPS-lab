import java.util.*;

class Q1 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the base of the number: ");
        int b = scan.nextInt();
        System.out.println("Enter the exponent: ");
        int e = scan.nextInt();
        double power = Math.pow(b,e);
        System.out.println(power);
    }
}