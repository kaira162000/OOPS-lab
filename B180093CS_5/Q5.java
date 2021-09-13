import java.util.*;

class Q5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final long UGFEE = scan.nextLong();
        final long PGFEE = scan.nextLong();
        int num = scan.nextInt();
        Hashtable<String, Student> studs = new Hashtable<String, Student>();
        scan.nextLine();
        for(int i = 0; i < num; ++i) {
            String name  = scan.next();
            String rollNum = scan.next();
            String group = scan.next();
            if(group.toLowerCase().equals("ug")) {
                studs.put(rollNum,new UnderGraduate(name, rollNum, UGFEE));
            } else {
                studs.put(rollNum, new PostGraduate(name, rollNum, PGFEE));   
            }
        }
        String search = scan.next();
        System.out.println(studs.get(search).getFeeDetails());
    }
}

abstract class Student {
    public String name;
    public String rollNum;
    public long fee;
    abstract long getFeeDetails();
    abstract  void setFeeDetails(long fee);
    public Student(String name, String rollNum) {
        this.name = name;
        this.rollNum = rollNum;
    }
}

class UnderGraduate extends Student {
    public UnderGraduate(String name, String rollNum, long fee) {
        super(name, rollNum);
        setFeeDetails(fee);
    }
    public long getFeeDetails() {
        return this.fee;
    }
    public void setFeeDetails(long fee) {
        this.fee = fee;
    }
}

class PostGraduate extends Student {
    public PostGraduate(String name, String rollNum, long fee) {
        super(name, rollNum);
        setFeeDetails(fee);
    }
    public long getFeeDetails() {
        return this.fee;
    }
    public void setFeeDetails(long fee) {
        this.fee = fee;
    }
}

