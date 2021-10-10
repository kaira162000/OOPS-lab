import java.util.InputMismatchException;
import java.util.Scanner;

public class Q3 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        try {
            int n = scan.nextInt();
            int[] array = new int[n];
            for(int i = 0; i < n; ++i)
                array[i] = scan.nextInt();
            scan.nextLine();
            String s[] = scan.nextLine().split("( )+");
            int sum = 0;
            for(String s1 : s) {
                if(!s1.isEmpty())
                    sum += array[Integer.parseInt(s1)];
            }
            System.out.println(sum);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException. Enter valid index.");
        } catch(InputMismatchException e) {
            System.out.println("InputMismatchException. Enter valid input");
        }
        scan.close();
    }
}
