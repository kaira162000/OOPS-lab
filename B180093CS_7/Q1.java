import java.util.Scanner;

public class Q1 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n1, n2, ans = 0;
        char op = scan.nextLine().charAt(0);
        String a = scan.nextLine();
        String b = scan.nextLine();
        try {
            n1 = Integer.parseInt(a);
            n2 = Integer.parseInt(b);
        } catch(NumberFormatException e) {
            System.out.println("NumberFormatException handled: Please enter valid numbers");
            scan.close();
            return ;
        } 
        try {
            switch(op){
                case '+': ans = n1 + n2; break;
                case '-': ans = n1 - n2; break;
                case '*': ans = n1*n2; break;
                case '%': ans = n1%n2; break;
                case '/': ans = n1/n2; break;
                default: System.out.println("Operator invalid"); return ;
            }
        } catch(ArithmeticException e) {
            System.out.println("ArithmeticException: Division by zero handled. Enter a valid argument.");
            scan.close();
            return ;
        }
        System.out.println(ans);
        scan.close();
    }
}
