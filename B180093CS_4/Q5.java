import java.util.*;

class Q5 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        Dealer[] dealers = new Dealer[n];
        for(int i = 0; i < n; ++i) {
            String[] s = scan.nextLine().split(" ");
            dealers[i] = new Dealer(s[4], Float.parseFloat(s[5]), new Car(s[0],s[1],Double.parseDouble(s[2]),Double.parseDouble(s[3])));
        }
        for(Dealer d : dealers) {
            System.out.println(d.car.modelName + " " + d.car.totalPrice() + " " + d.onRoadPrice());
        }
    }
}

class Car {
    String modelName;
    String engineNo;
    double basePrice;
    double additionalCharge;

    public Car(String modelName, String engineNo, double basePrice, double additionalCharge) {
        this.modelName = modelName;
        this.engineNo = engineNo;
        this.basePrice = basePrice;
        this.additionalCharge = additionalCharge;
    }

    public double totalPrice() {
        return this.basePrice + this.additionalCharge;
    }
}

class Dealer {
    String dealerName;
    float discountPercentage;
    Car car;

    public Dealer(String name, float discount, Car car) {
        this.dealerName = name;
        this.discountPercentage = discount;
        this.car = car;
    }

    public double onRoadPrice() {
        double price = car.totalPrice();
        return price - (this.discountPercentage*price/100);
    } 
}