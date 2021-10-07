import java.util.*;

public class Q2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Flipkart cart = new Flipkart();
        for(int i = 0; i < n ; ++i){
            cart.transaction(scan.next(),scan.nextInt(), scan.nextInt());
            scan.nextLine();
        }
        scan.close();
    }
}

class Flipkart implements HDFC,ICICI{
    int bal;
    ArrayList<String> bank;

    Flipkart() {
        bank = new ArrayList<>();
        bal = 0;
    }

    public void transaction(String b, int bal, int pprice) {
        this.bank.add(b);
        this.bal += pprice;
        System.out.println(this.bal + " " + (bal-pprice));
    }
}
interface HDFC {
    void transaction(String bank, int bal, int pprice);
}
interface ICICI {
    void transaction(String bank, int bal, int pprice);
}