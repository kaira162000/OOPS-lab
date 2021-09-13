import java.util.*;
import com.chandana.q3.*;

class Q3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] s = scan.nextLine().split("( )+");
        int a = Integer.parseInt(s[0]);
        if(s.length != 1) {
            int b = Integer.parseInt(s[1]);
            Rectangle rectangle = new Rectangle(a,b);
            System.out.println("Rectangle Perimeter " + rectangle.perimeter());
            System.out.println("Rectangle Area " + rectangle.area());
        } else {
            Square square = new Square(a);
            System.out.println("Square Perimeter " + square.perimeter());
            System.out.println("Square Area " + square.area());
        }
        scan.close();
    }
}
