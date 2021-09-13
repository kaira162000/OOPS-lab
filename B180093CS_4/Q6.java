import java.util.*;

class Q6 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        Employee[] emps = new Employee[n];
        for(int i = 0; i < n; ++i) {
            String[] s = scan.nextLine().split(" ");
            switch(Integer.parseInt(s[0])) {
                case 1: {
                    emps[i] = new PermenantEmployee(s[1], s[2], Long.parseLong(s[3]));
                    break;
                }
                case 2: {
                    emps[i] = new TemporaryEmployee(s[1], s[2], Integer.parseInt(s[3]), Integer.parseInt(s[4]));
                    break;
                }
                default: {
                    System.out.println("Employee_type: " + s[0] + " invalid choice");
                }
                
            }
        }
        String id = scan.next();
        for(Employee e : emps) {
            if(e.id.equals(id)) {
                System.out.println(id + " " + e.name + " " + e.salary);
            }
        }
        scan.close();
    }
}

class Employee {
    String id;
    String name;
    long salary;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }
}

class PermenantEmployee extends Employee {
    long basicPay;
    long pfAmount;

    public PermenantEmployee(String id, String name, long basicPay) {
        super(id, name);
        this.basicPay = basicPay;
        this.pfAmount = this.basicPay*12/100;
        CalculateSalary();
    }

    public void CalculateSalary() {
        this.salary = this.basicPay - this.pfAmount;
    }
}

class TemporaryEmployee extends Employee {
    int hoursWorked;
    int hourlyWages;

    public TemporaryEmployee(String id, String name, int hoursWorked, int hourlyWages) {
        super(id, name);
        this.hoursWorked = hoursWorked;
        this.hourlyWages = hourlyWages;
        CalculateSalary();
    }

    public void CalculateSalary() {
        this.salary = this.hoursWorked*this.hourlyWages;
    }
}
 