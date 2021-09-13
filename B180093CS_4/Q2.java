//compile time polymorphism - overloading

import java.util.*;
import java.lang.Math;

class Q2 {

    public static double circle(int r) {
        return Math.round(Math.PI*r*r*100)/100.0;
    }

    public static double triangle(int a, int b, int c) {
        double s = (a + b + c)/2;
        return Math.round(Math.sqrt(s*(s-a)*(s-b)*(s-c))*100)/100.0;
    }

    public static double rectangle(int b, int h) {
        return Math.round(b*h*100)/100.0;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();
        String[] temp = s.split(" ");
        int[] num = new int[temp.length];
        for(int i = 0; i < temp.length; ++i)
            num[i] = Integer.parseInt(temp[i]);

        double output = 0;
        switch(num.length) {
            case 1: {
                output = circle(num[0]);
                break;
            }
            case 2: {
                output = rectangle(num[0], num[1]);
                break;
            }
            case 3: {
                output = triangle(num[0], num[1], num[2]);
            }
            default: {
                scan.close();
                System.out.println("Wrong input");
                return ;
            }
        }
        System.out.println(output);
        scan.close();
    }
}