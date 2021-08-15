import java.util.*;

class Q5 {
    public static void main(String args[]) {
        String S;
        int days, price;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the inmate details: ");
        S = scan.nextLine();
        System.out.print("Enter the number of days: ");
        days = scan.nextInt();
        String[] list = S.split("( )+");
        /*for(String string: list)
            System.out.println(string);*/
        if(list[2].equalsIgnoreCase("veg")) {
            price = 100*days;
        } else if(list[2].equalsIgnoreCase("nonveg")) {
            price = 120*days;
        } else {
            System.out.print("Please enter valid string");
            return ;
        }
        if(list[1].equalsIgnoreCase("employee")) {
            price += (price*5)/100;
        }
        System.out.print(price);
    }
}