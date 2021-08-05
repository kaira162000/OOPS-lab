import java.util.*;

class Q4 {
    public static void main(String args[]) {
        long reverse = 0;
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        while(num != 0) {
            reverse = reverse*10 + num%10;
            num = num/10;
        }
        System.out.println(reverse);
    }
}