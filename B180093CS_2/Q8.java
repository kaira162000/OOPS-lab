import java.util.*;

class Q8 {
    public static void printMenu() {
        System.out.println("\n1-Add details\n2-Show details\n3-Exit\n");
    }

    public static void main(String args[]) {
        ArrayList<Train> buses = new ArrayList<Train>();
        Scanner scan = new Scanner(System.in);
        while(true) {
            printMenu();
            System.out.print("Enter choice: ");
            int choice = scan.nextInt();
            switch(choice) {
                case 1: {
                    System.out.println("Enter bus details(Busno,from,to,distance,type)");
                    String num = scan.next();
                    String from = scan.next();
                    String to = scan.next();
                    double dist = scan.nextDouble();
                    String type = " ";
                    type = scan.nextLine();
                    type = type.trim();
                    if(!type.isEmpty()) {
                        buses.add(new Train(num, from, to, dist, type.charAt(0)));
                    }else
                        buses.add(new Train(num, from, to, dist));
                    break;
                }
                case 2: {
                    System.out.println("Bus Details (Busno,from,to,distance,type, fare)");
                    for(int i = 0;i < buses.size(); ++i) {
                        buses.get(i).Show();
                    }
                    break;
                }
                case 3: {
                    scan.close();
                    return ;
                }
                default: System.out.println("Please enter valid number");
            }
        }
    }
}

class Train {
    private String busno;
    private String from;
    private String to;
    private double distance;
    private char type;

    public Train(String busno, String from, String to, double distance, char type) {
        this.busno = busno;
        this.from = from;
        this.to = to;
        this.distance = distance;
        this.type = type;
    }

    public Train(String busno, String from, String to, double distance) {
        this(busno, from, to, distance, 'O');
    }

    public double CalcFare() {
        double fare = 0;
        switch(Character.toUpperCase(this.type)) {
            case 'O': {
                fare = 10.0*this.distance;
                break;
            }
            case 'F': {
                fare = 20.0*this.distance;
                break;
            }
            case 'L': {
                fare = 24.0*this.distance;
                break;
            }
        }
        return fare;
    }

    public void Show() {
        System.out.println(this.busno + " " + this.from + " " + this.to + " " + this.distance + " " + this.type + " " + CalcFare());
    }
}