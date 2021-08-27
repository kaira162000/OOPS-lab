import java.util.*;

public class Q5 {

    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of patients: ");
        int N = scan.nextInt();
        //scan.nextLine();
        Patient[] patients = new Patient[N];
        for(int i = 0; i < N ; ++i) {
            System.out.println("\nEnter the details of patient" + (i+1) + ": ");
            System.out.print("Name: ");
            String name = scan.next();
            System.out.print("Patient ID: ");
            String id = scan.next();
            patients[i] = new Patient(name, id);
        }
        System.out.println("\nList of Patients to be tested are:");
        Arrays.sort(patients);
        for(Patient p: patients) {
            System.out.println(p.getId() + " " + p.getName());
        }
    }
}

class Patient extends Person implements Comparable<Patient> {

    private String id;

    public Patient(String name, String id) {
        super(name);
        this.id = id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public int compareTo(Patient patient) {
        int id = Integer.parseInt(patient.getId().substring(5));
        return id - Integer.parseInt(this.id.substring(5));
    }
}

class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}