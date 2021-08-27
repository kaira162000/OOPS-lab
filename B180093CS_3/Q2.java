import java.util.*;

public class Q2 {

    static class Item {
        public String id;
        public String name;
        public int price;

        public Item(String id, String name, int price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }
    }

    static class Iitem {
        public String id;
        public int quantity;
        public int cost;

        public Iitem(String id, int quantity) {
            this.id = id;
            this.quantity = quantity;
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the available inventory items line by line, type OKAY at the end of the list:");
        HashMap<String, Item> items = new HashMap<String, Item>();
        String s = scan.nextLine();
        while(!s.equals("OKAY")) {
            String[] temp = s.split(" ");
            //System.out.print(temp[0] + temp[1] + temp[2]);
            items.put(temp[0],new Item(temp[0], temp[1], Integer.parseInt(temp[2])));
            s = scan.nextLine();
        }
        while(true) {
            System.out.println("\n1.Add Invoice\n2.Exit\nChoice:");
        int choice = scan.nextInt();
        scan.nextLine();
        switch(choice) {
            case 1: {
                ArrayList<Iitem> iitems = new ArrayList<Iitem>();
                System.out.println("\nAdd Invoice Item(Y/N)");
                if(scan.nextLine().equals("Y")) {
                    System.out.println("Enter Inventory ID and Quantity line by line, type OKAY at the end of the list");
                    String S = scan.nextLine();
                    while(!S.equals("OKAY")) {
                        String[] temp2 = S.split(" ");
                        iitems.add(new Iitem(temp2[0], Integer.parseInt(temp2[1])));
                        S = scan.nextLine();
                    }
                }
                System.out.println("****INVOICE****");
                int total = 0;
                for(Iitem i: iitems) {
                    Item j = items.get(i.id);
                    i.cost = j.price*i.quantity;
                    System.out.println(j.id + "," + j.name + "," + j.price + "," + i.quantity);
                    total += i.cost;
                }
                System.out.println("Total:" + total);
                System.out.println("********");
                break;
            }
            case 2: {
                return ;
            }
            default: {
                System.out.println("Enter valid choice");
            }
        }
        }
    }
}
