import java.util.InputMismatchException;
import java.util.Scanner;

//Input issue
public class Q5 {
    public static void main(String args[]) throws Exception {
        Scanner scan = new Scanner(System.in);
        try {
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();
            int n = scan.nextInt();
            for(int i = 0; i < n; ++i) {
                String s = scan.next().toLowerCase();
                int j = scan.nextInt();
                switch(s) {
                    case "up": n1 -= j; break;
                    case "down": n1 += j;break;
                    case "left": n2 -= j; break;
                    case "right": n2 += j; break;
                    default: System.out.println("Invalid move"); scan.close(); return;
                }
            }
            if(n1 < 1 || n1 > 8 || n2 < 1 || n2 > 8)
                throw new Exception("Overflow");
            System.out.println("[" + n1 + ","+ n2 + "]");
        } catch(InputMismatchException e) {
            System.out.println("Invalid input");
        } finally {
            scan.close();
        }
    }
}
