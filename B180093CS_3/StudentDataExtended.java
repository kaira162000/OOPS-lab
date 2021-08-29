package package1;

import package1.*;
import java.util.*;

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
