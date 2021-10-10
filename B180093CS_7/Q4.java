import java.util.InputMismatchException;
import java.util.Scanner;

public class Q4 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        try {
        String s = scan.nextLine();
        int n = Integer.parseInt(s.substring(0,8),2);
        String answer = "";
        //System.out.println(n);
        int i = 1;
        while(i*8 < s.length()) {
            int temp1 = Integer.parseInt(s.substring(i*8,i*8+8),2);
            answer += (char)(temp1 ^ n);
            ++i;
        }
        System.out.println(answer);
        } catch(StringIndexOutOfBoundsException e) {
            System.out.println("Incorrect Input");
        } catch(NumberFormatException e) {
            System.out.println("Invalid Input format");
        }
        scan.close();
    }
}
