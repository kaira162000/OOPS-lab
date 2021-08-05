import java.util.*;

class Q3 {
    public static void main(String args[]) {
        int digits = 0;
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        while(num != 0) {
            num = num/10;
            digits++;
        }
        System.out.println(digits);
    }
}