//compile time polymorphism - overloading

import java.util.*;

class Q1 {

    public static int bitand(int a, int b) {
        return a&b;
    }

    public static int bitand(int a, int b, int c) {
        return a&b&c;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] num = s.split(" ");

        switch(num.length) {
            case 2: {
                System.out.println(bitand(Integer.parseInt(num[0]),Integer.parseInt(num[1])));
                break;
            }
            case 3: {
                System.out.println(bitand(Integer.parseInt(num[0]),Integer.parseInt(num[1]),Integer.parseInt(num[2])));
                break;

            }
            default: {
                scan.close();
                System.out.println("Wrong input");
                return ;
            }
        }
        scan.close();
    }
}