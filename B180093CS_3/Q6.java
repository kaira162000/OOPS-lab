/*LEARNINGS
1. 
*/
import java.util.*;
import java.lang.*;
import package1.*;

public class Q6 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of students :");
        int N = scan.nextInt();
        StudentDataExtended[] students = new StudentDataExtended[N];
        scan.nextLine();
        for(int i = 0; i < N; ++i) {
            System.out.println("Enter the details of Student" + (i+1) + "(id, name, location):");
            students[i] = new StudentDataExtended();
            students[i].addDetails(scan.next(), scan.next(), scan.next());
        }
        System.out.println("The Student Details are: ");
        StudentDataExtended.printDetails(students);
    }
}

public class StudentDataExtended extends package1.StudentData implements Comparable<StudentDataExtended>{

    private String location;

    public void addDetails(String id, String name, String location) {
        setId(id);
        setName(name);
        this.location = location;
    }

    public static void printDetails(StudentDataExtended[] students) {
        Arrays.sort(students);
        int N = students.length;
        for(int i = 0; i < N; ++i) {
            System.out.println(students[i].getId() + " " + students[i].getName() + " " + students[i].location);
        }
    }

    public int compareTo(StudentDataExtended student) {
        int id = Integer.parseInt(student.getId().substring(1));
        return Integer.parseInt(this.getId().substring(1)) - id;

    }
}
