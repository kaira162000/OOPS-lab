import java.util.*;

public class Q1{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Bank bank = new Bank(scan.nextLong());
        long a = scan.nextLong();
        long b = scan.nextLong();
        long c = scan.nextLong();
        bank.balanceLeft(a, b, c);
    }
}
//An interface has only abstract methods & abstract attributes
//so if there aren't defined by abstract keyword too, 
//default would be taken as abstract and public
//Java supports abstract methods and classes only
//doesn't support abstract attributes.

interface Conversion {
    long convertRupees(long r);
    long convertDollars(long r);
    long convertPounds(long r);
}

//The class which implements the interface should 
//define all the abstract methods
//Default access modifier in a class is default
class Bank implements Conversion {
    long rupees;
    public Bank(long r) {
        this.rupees = r;
    }

    public long convertPounds(long r) {
        return r*100;
    }

    public long convertDollars(long r) {
        return r*70;
    }

    public long convertRupees(long r) {
        return r;
    }

    public void balanceLeft(long a, long b, long c) {
        long purchase = convertRupees(a) + convertDollars(b) + convertPounds(c);
        if(this.rupees >= purchase)
            System.out.println(this.rupees - purchase);
        else
            System.out.println("Insufficient Balance");
    }
}