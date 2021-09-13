import java.util.*;

class Q1 {

    public static void display() throws Exception {
        throw new Exception("Invalid arguments");
    }

    public static void display(char a, int n) {
        for(int i = 1; i <= n; ++i) {
            for(int j = 0; j < i-1; ++j) {
                System.out.print(a + " ");
            }
            System.out.println(a);
        }
    }

    public static void display(int n) {
        long a = 0;
        for(int i = 1; i <= n; ++i) {
            a += i;
        }
        System.out.println(a);
    }

    public static void display(int a, int b) {
        System.out.println(a*a + b*b);
    }

    public static void main(String[] args) throws Exception {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan = new Scanner(scan1.nextLine());
        if(scan.hasNextInt()) {
            int a = scan.nextInt();
            if(scan.hasNextInt()){
                int b = scan.nextInt();
                display(a,b);
            } else {display(a);}
        } else {
            char a = scan.next().charAt(0);
            int b = scan.nextInt();
            display(a,b);
        }
        scan.close();
    }
}