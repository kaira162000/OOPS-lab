import java.util.*;
import com.chandana.q2.*;

class Q2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] s = scan.nextLine().split("( )*=( )*");
        try {
            double amount = Double.parseDouble(s[1]);
            SBI sbi = new SBI(amount);
            ICICI icici = new ICICI(amount);
            AXIS axis = new AXIS(amount);
            sbi.display_interest();
            icici.display_interest();
            axis.display_interest();
        } catch(Exception e) {
            System.out.println(e);
        }
        
    }
}
