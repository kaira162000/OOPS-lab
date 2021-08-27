import java.util.*;

public class Q4 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Manager[] managers = new Manager[N];
        for(int i = 0; i < N; ++i) {
            managers[i] = new Manager(scan.next(), scan.next(), scan.next(), Integer.parseInt(scan.next()), Integer.parseInt(scan.next()));
        }
        Arrays.sort(managers);
        int s = managers[0].salary + managers[0].bonus;
        for(Manager m: managers){
            if(s != m.salary + m.bonus) {
                break;
            }
            else{
                System.out.println(m.id + " " + m.name + " " + m.department + " " + m.salary + " " + m.bonus);
            }
        }
        
    }
}

class Manager extends Employee implements Comparable<Manager>{
    public int bonus;
    public Manager(String id, String name, String department, int salary, int bonus) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.bonus = bonus;
    }

    public int compareTo(Manager manager) {
        int salary = manager.salary + manager.bonus;
        return salary - this.salary;
    }
}

class Employee {
    public String id;
    public String name;
    public String department;
    public int salary;
}