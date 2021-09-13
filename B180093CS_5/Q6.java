import java.util.*;

class Q6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Customer Details:");
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Mobile: ");
        String mobileNum = scan.nextLine();
        System.out.print("Membership: ");
        String membership = scan.nextLine();

        Customer customer = new Customer(name, mobileNum, membership);

        while(true) {
            System.out.print("\nAdd Service(Y/N): ");
            if(Character.compare(scan.nextLine().toLowerCase().charAt(0), 'y')==0) {
                System.out.print("Service Name: ");
                String serviceName = scan.nextLine();
                System.out.print("Rate: ");
                float rate = scan.nextFloat();
                scan.nextLine();
                customer.addService(serviceName, rate);
            } else break;
        }
        customer.calculateBill();  
    }
}

class Customer {
    public String name;
    public String mobileNum;
    public Membership membership;
    public ArrayList<Service> services;
    public long bill;

    public Customer(String name, String mobileNum, String membership) {
        this.name = name;
        this.mobileNum = mobileNum;
        switch(membership.toLowerCase()) {
            case "premium" : {
                this.membership = new Premium();
                break;
            }
            case "gold" : {
                this.membership = new Gold();
                break;
            }
            case "silver" : {
                this.membership = new Silver();
                break;
            }
        }
        this.bill = 0;
        services = new ArrayList<Service>();
    }

    public void addService(String serviceName, float cost) {
        services.add(new Service(serviceName, cost));
    }

    public void calculateBill() {
        System.out.println(this.name + "  " + this.mobileNum + "  " + this.membership.name);
        System.out.println("*****BILL*****");
        double bill = 0;
        int i = 1;
        for(Service s : services) {
            System.out.println(i + "." + s.serviceName + "   " + Math.round(s.cost));
            bill +=  s.cost;
            ++i;
        }
        this.bill = (long)(bill*membership.discountP)/100;
        System.out.println("Total: " + Math.round(bill) + "-" + this.bill);
        this.bill = Math.round(bill - this.bill);
        System.out.println("Please Pay: " + this.bill);
    }

}


class Service {
    public String serviceName;
    public float cost;

    public Service(String serviceName, float cost) {
        this.serviceName = serviceName;
        this.cost = cost;
    }
}

class Membership {
    public String name;
    public int discountP;
    public Membership() {
        discountP = 0;
    }
}

class Premium extends Membership {
    public Premium() {
        this.name = "Premium";
        this.discountP = 20;
    }
}

class Gold extends Membership {
    public Gold() {
        this.name = "Gold";
        this.discountP = 15;
    }
}

class Silver extends Membership {
    public Silver() {
        this.name = "Silver";
        this.discountP = 15;
    }
}