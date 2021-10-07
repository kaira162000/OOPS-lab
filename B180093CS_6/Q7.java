import java.util. *;

public class Q7 {
    public static void main(String[] args)
    {
        ArrayList<Car> Clist = new ArrayList<Car>();
        ArrayList<Truck> Tlist = new ArrayList<Truck>();
        Scanner scan = new Scanner(System.in);
        while(true)
        {
            System.out.print("\n1.Add Vehicle\n2.Display Vehicles\n3.Exit\nEnter choice:");
            int ip = scan.nextInt();
            if(ip == 1)
            {
                System.out.print("a.Car\nb.Truck\nEnter your choice:");
                String ip1 = scan.next();
                if(ip1.equals("a"))
                {
                    System.out.print("ModelNumber:");
                    String Mnumber = scan.next();
                    System.out.print("Rate:");
                    int Rate = scan.nextInt();
                    System.out.print("FuelType(petrol/diesel):");
                    String Ftype = scan.next();
                    System.out.print("Passengers:");
                    int Pnum = scan.nextInt();
                    Clist.add(new Car(Mnumber, Rate, Ftype, Pnum));
                }
                else if(ip1.equals("b"))
                {
                    System.out.print("ModelNumber:");
                    String Mnumber = scan.next();
                    System.out.print("Rate:");
                    int Rate = scan.nextInt();
                    System.out.print("FuelType(petrol/diesel):");
                    String Ftype = scan.next();
                    System.out.print("Loadlimit:");
                    int LLimit = scan.nextInt();
                    Tlist.add(new Truck(Mnumber, Rate, Ftype, LLimit));
                }
                else
                {
                    System.out.println("ERR: Invalid Input!!");
                }

            }
            else if(ip==2)
            {
                Collections.sort(Clist);
                Collections.sort(Tlist);
                int i=0,j=0;
                while(i<Clist.size()&&j<Tlist.size())
                {
                    if(Clist.get(i).calculateTax()>Tlist.get(j).calculateTax())
                    {
                        Clist.get(i).display();                     //IMP
                        i++;
                    }
                    else
                    {
                        Tlist.get(j).display();
                        j++;
                    }
                }
                while(i<Clist.size())
                {
                    Clist.get(i).display();                     
                    i++;
                }
                while(j<Tlist.size())
                {
                    Tlist.get(j).display();
                    j++;
                }
            }
            else if(ip==3)
            {
                break;
            }
            else
            {
                System.out.println("ERR: Invalid input, Try Again!!");
            }
        }
        scan.close();
    }    
}

interface TaxCalculatable
{
    int calculateTax();
}

abstract class Vehicle implements TaxCalculatable
{
    String ModelNumber;
    int rateBought;
    String fuelType;
    int numberOfWheels;

    Vehicle(String Mnum,int Rate,String Ftype,int WheelNum)
    {
        ModelNumber = Mnum;
        rateBought=Rate;
        fuelType = Ftype;
        numberOfWheels = WheelNum;
    }
    abstract void display();
}

class Car extends Vehicle implements Comparable<Car>
{
    int numberOfPassengers;
    Car(String Mnum,int Rate,String Ftype,int Pnum)
    {
        super(Mnum,Rate,Ftype,4);
        numberOfPassengers = Pnum;
    }

    public int calculateTax()
    {
        if(fuelType.equals("petrol"))
        {
            return ((rateBought*1*numberOfPassengers*5)/100);
        }
        else
        {
            return (rateBought*1*numberOfPassengers*4)/100;
        }

    }
    public int compareTo(Car c)
    {
        return c.calculateTax()-this.calculateTax();
    }

    void display()
    {
        System.out.println(ModelNumber+" "+fuelType+" "+calculateTax());
    }
}

class Truck extends Vehicle implements Comparable<Truck>
{
    int loadLimit;
    Truck(String Mnum,int Rate,String Ftype,int LoadLimit)
    {
        super(Mnum,Rate,Ftype,6);
        loadLimit = LoadLimit;
    }
    public int calculateTax()
    {
        if(fuelType.equals("petrol"))
        {
            return (int)(rateBought*0.1*loadLimit*0.002*0.5);
        }
        else
        {
            return (int)(rateBought*0.1*loadLimit*0.002*0.4);
        }
    }

    public int compareTo(Truck t)
    {
        return t.calculateTax()-this.calculateTax();
    }
    void display()
    {
        System.out.println(ModelNumber+" "+fuelType+" "+calculateTax());
    }
}
