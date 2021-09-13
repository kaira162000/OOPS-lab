import java.util.*;

class Q7 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        PGStudent[] pgstudents =  new PGStudent[n];
        for(int i = 0; i < n; ++i) {
            String[] s = scan.nextLine().split(":");
            pgstudents[i] = new PGStudent(s[2], Float.parseFloat(s[3]), s[0], Integer.parseInt(s[1]));
        }
        Arrays.sort(pgstudents);
        for(PGStudent s : pgstudents) {
            System.out.println(s.personName);
        }
    }
}

class Person {
    String personName;
    int age;

    public Person(String name, int age) {
        this.personName = name;
        this.age = age;
    }
}

class Student extends Person {
    String rollno;
    float marksP;

    public Student(float marksP, String name, int age) {
        super(name, age);
        this.marksP = marksP;
    }
}

class PGStudent extends Student implements Comparable<PGStudent> {
    String elective;

    public PGStudent(String elective, float marksP, String name, int age) {
        super(marksP, name, age);
        this.elective = elective;
    }

    public int compareTo(PGStudent student) {
        return Float.compare(student.marksP, this.marksP);
    }
}