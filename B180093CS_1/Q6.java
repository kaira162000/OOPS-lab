import java.util.*;

class Q6 {

    public static long getReverse(long n) {
        long reverse = 0;
        while(n != 0) {
            long reminder = n%10;
            reverse = reminder+reverse*10;
            n = n/10;
        }
        return reverse;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long rev = getReverse(n);
        if (rev == n)
            System.out.println("True");
        else
            System.out.println("False");
    }
}