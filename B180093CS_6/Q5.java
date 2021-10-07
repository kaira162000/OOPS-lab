import java.util.*;

public class Q5 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();  
        ArrayList<Student> students = new ArrayList<Student>();  
        for(int i = 0; i < n; ++i) {
            students.add(new Student(scan.nextInt(), scan.next(), scan.next()));
            scan.nextLine();
        }
        System.out.println();
        Collections.sort(students, Student.orderByRollno);
        for(Student s : students)
            System.out.println(s.rollno + " " + s.name + " " + s.address);
        System.out.println();
        Collections.sort(students, Student.orderByName);
        for(Student s : students)
            System.out.println(s.rollno + " " + s.name + " " + s.address);
        scan.close();
    }
}

class Student implements OrderStudents{
    String name;
    int rollno;
    String address;

    public Student(int rollno, String name, String address) {
        this.name = name;
        this.rollno = rollno;
        this.address = address;
    }
}

interface OrderStudents{
    public static Comparator<Student> orderByName = new Comparator<Student>(){
        public int compare(Student s1, Student s2) {
            return s1.name.compareTo(s2.name);
        }
    };


    public static Comparator<Student> orderByRollno = new Comparator<Student>(){
        public int compare(Student s1, Student s2) {
            return s1.rollno - s2.rollno;
        }
    };
}
