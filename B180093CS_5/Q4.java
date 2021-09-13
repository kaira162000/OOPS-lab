import java.util.*;
import com.chandana.q4.*;

class Q4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s[] = scan.nextLine().split("( )+");
        if(s.length == 2) {
            IntegerAddition ia = new IntegerAddition(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
            ia.add();
        } else if (s.length == 4) {
            FractionAddition fa = new FractionAddition(Integer.parseInt(s[0]), Integer.parseInt(s[1]),Integer.parseInt(s[2]), Integer.parseInt(s[3]));
            fa.add();
        } else {
            System.out.println("Wrong arguments!");
        }
        scan.close();
    }
}
