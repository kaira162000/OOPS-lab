import java.util.*;

public class Q7 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.print("Enter the number of students: ");
        num = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter details (rollNumber, fullName, height, weight) separated by comma in each line");
        Students[] students = new Students[num];
        for(int i = 0;i < num; ++i) {
            students[i] = new Students();
            String[] list = (scan.nextLine()).split("( )*,( )*");
            students[i].readStudent(list[0], list[1], Integer.parseInt((list[2].split("( )*(cm|Cm|cM|CM)"))[0]), Integer.parseInt((list[3].split("( )*(Kg|kg|kG|KG)"))[0]));
        }
        Arrays.sort(students);
        System.out.println("Output: ");
        for(int i = 0; i<num ; ++i)
            students[i].printStudentDetails();
    }
}

public class Students implements Comparable<Students>{
    private String rollNumber;
    private String fullName;
    public int height;
    private int weight;
    
    public void readStudent(String rollNumber, String fullName, int height, int weight) {
        this.rollNumber = rollNumber;
        this.fullName = fullName;
        this.height = height;
        this.weight = weight;
    }

    public void printStudentDetails() {
        System.out.println(this.rollNumber + ", " + this.fullName + ", " + this.height+ "cm" + ", " + this.weight + "Kg");
    }

    public int compareTo(Students student) {
        int compareQuantity = student.height;
        return this.height - compareQuantity;
    }
}