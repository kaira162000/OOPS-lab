import java.util.*;

class Q6 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int num = scan.nextInt();
        //scan.next();
        //System.out.print(num);
        StudentDetails[] students = new StudentDetails[num];
        System.out.println("Enter student details: ");
        for(int i = 0; i <num; ++i) {
            try{
                students[i] = new StudentDetails();
            students[i].setName(scan.next());
            students[i].setrollNum(scan.next());
            students[i].setCGPA(scan.nextFloat());
            } catch(NullPointerException e) {
                System.out.println(e);
            }
        }       
        for(int i=0; i<num ; ++i) {
            System.out.println("\n"+students[i].getName() + " " + students[i].getrollNum()+ " " + students[i].getCGPA()+ " " + students[i].getPercentage() + "%");

        }
        scan.close();
    }
}

public class StudentDetails {
    private String name;
    private String rollNum;
    private float cgpa;
    private double percentage;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setrollNum(String rollNum) {
        this.rollNum = rollNum;
    }

    public String getrollNum() {
        return this.rollNum;
    }

    public void setCGPA(float cgpa) {
        this.cgpa = cgpa;
        this.percentage = cgpa * 9.5;
    }

    public float getCGPA() {
        return cgpa;
    }   

    public double getPercentage() {
        return this.percentage;
    }
}
