import java.util.*;

class Q3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();
        ArrayList<Student> students = new ArrayList<Student>();
        for(int i = 0; i < N; ++i) {
            //try for , and space without exact number
            //s.replaceAll("[,|( )+]"," ");
            String[] s = scan.nextLine().replaceAll("[()]", "").split(",");
            students.add(new Student(s[0],Integer.parseInt(s[1]), Integer.parseInt(s[2])));
        }
        Collections.sort(students);
        Student.removeDups(students);
        int length = students.size();
        System.out.println(length);
        int i = 0;
        for(i = 0; i < length-1; ++i) {
            System.out.print(students.get(i).name + ",");
        }
        System.out.println(students.get(i).name);
    }
}


class Student implements Comparable<Student> {

    String name;
    int rollno;
    int height;
    
    public Student(String name, int rollno, int height) {
        this.name = name;
        this.rollno = rollno;
        this.height = height;
    }

    public int compareTo(Student student) {
        if(this.height == student.height) {
            return this.name.compareTo(student.name);
        }
        return this.height-student.height;
    }

    public static void removeDups(ArrayList<Student> students) {
        int height = -1;
        int length = students.size();
        for(int i = 0; i < length; ++i) {
            Student j = students.get(i);
            if(j.height == height) {
                height = j.height;
                students.remove(j);
                --length;
                --i;
            }
            else height = j.height;
        }
    }
}
