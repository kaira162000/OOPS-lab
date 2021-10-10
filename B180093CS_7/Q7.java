import java.util.*;

public class Q7 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        try {
            System.out.println(Integer.parseInt(s,16));
        } catch(NumberFormatException e) {
            System.out.println("InvalidHexDecimal");
        }
        scan.close();
    }
}
