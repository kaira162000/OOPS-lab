import java.util.*;

public class Q3 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        switch(scan.nextLine().toUpperCase()) {
            case "CIRCLE": {
                Circle c = new Circle();
                c.area(scan.nextInt());
                break;
            }
            case "SQUARE": {
                Square s = new Square();
                s.area(scan.nextInt());
                break;
            }
            default: {
                System.out.println("Invalid input");
            }
        }

        scan.close();
    }
}

class Circle implements ShapeArea{
    public void area(int a) {
        System.out.println(pi*a*a);
    }
}   

class Square implements ShapeArea{
    public void area(int a) {
        System.out.println(a*a);
    }
}
interface ShapeArea {
    final double pi = 3.14;
    void area(int a);
}