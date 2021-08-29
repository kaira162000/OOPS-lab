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