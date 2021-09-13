import java.util.*;

class Q4 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        Customer[] customers = new Customer[n];
        for(int i = 0; i < n; ++i) {
            String[] s = scan.nextLine().split(":");
            long bal = Long.parseLong(s[2]);
            if(bal < 100000) {
                customers[i] = new Silver(s[0],s[1],bal);
            } else if(bal > 1000000) {
                customers[i] = new Platinum(s[0],s[1], bal);
            } else

                customers[i] = new Gold(s[0],s[1],bal);
        }
        for(Customer i : customers) {
            i.availableBalance();
        }
    }
}

class Customer {
    String customerName;
    String accountNo;
    long currentBalance;
 
    public Customer(String name, String no, long bal) {
        this.customerName = name;
        this.accountNo = no;
        this.currentBalance = bal;
    }

    public void availableBalance() {
        System.out.println(this.customerName + ":" + this.currentBalance);
    }
}

class Silver extends Customer {

    public Silver(String name, String no, long bal) {
        super(name,no,bal);
    }

    public void availableBalance() {
        long predBal = this.currentBalance + this.currentBalance*5/100;
        System.out.println(this.customerName + ":" + this.currentBalance + ":" + "Silver" + ":" + predBal);
    }
}

class Gold extends Customer {

    public Gold(String name, String no, long bal) {
        super(name,no,bal);
    }

    public void availableBalance() {
        long predBal = this.currentBalance + this.currentBalance*10/100;
        System.out.println(this.customerName + ":" + this.currentBalance + ":" + "Gold" + ":" + predBal);
    }
}

class Platinum extends Customer {

    public Platinum(String name, String no, long bal) {
        super(name,no,bal);
    }
    public void availableBalance() {
        long predBal = this.currentBalance + this.currentBalance*15/100;
        System.out.println(this.customerName + ":" + this.currentBalance + ":" + "Platinum" + ":" + predBal);
    }
}