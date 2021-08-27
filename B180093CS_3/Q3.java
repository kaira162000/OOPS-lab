import java.util.*;
import java.text.*;

public class Q3 {
    public static void main(String args[]) throws Exception {

        Scanner scan = new Scanner(System.in);
        DepartmentMeetingScheduler csed = new DepartmentMeetingScheduler();
        System.out.println("1. Schedule Meetings\n2. List Meetings");

        while(true) {
            System.out.print("\nEnter your choice: ");
            int choice = scan.nextInt();
            scan.nextLine();
            switch(choice) {
                case 1: {
                    System.out.print("Title - ");
                    String t = scan.nextLine();
                    System.out.print("Date - ");
                    String d = scan.nextLine();
                    System.out.print("Start time - ");
                    String st = scan.nextLine();
                    System.out.print("End time - ");
                    String et = scan.nextLine();
                    System.out.print("Description - ");
                    String desc = scan.nextLine();
                    csed.scheduleMeeting(t, d, st, et, desc);
                    break;
                }
                case 2: {
                    Date today = new Date();
                    SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
                    String s = formatter1.format(today);
                    Date date = formatter1.parse(s);
                    csed.displayMeetings(date);
                }
                default:
            }
        }
    }
}


class DepartmentMeetingScheduler {
    ArrayList<Meeting> meetings = new ArrayList<>();
    public void scheduleMeeting(String title, String date,String stime, String etime, String description) throws Exception  {
        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatter2 = new SimpleDateFormat("HH:mm");
        Date fdate = formatter1.parse(date);
        Date fstime = formatter2.parse(stime);
        Date fetime = formatter2.parse(etime);
        for(Meeting m: meetings) {
            if((formatter1.parse(m.date).compareTo(fdate) == 0) && (formatter2.parse(m.stime).compareTo(fstime) < 0 && formatter2.parse(m.etime).compareTo(fstime) >= 0 ) || (formatter2.parse(m.stime).compareTo(fetime) > 0 && formatter2.parse(m.etime).compareTo(fetime) <= 0)) {
                System.out.println("Collision! Already another meeting is scheduled");
                return ;
            }
        }
        meetings.add(new Meeting(title, date, stime, etime, description ));
        System.out.println("Scheduled successfully");
    }

    public void displayMeetings(Date date) throws Exception {
        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
        for(Meeting m: meetings) {
            if(date.compareTo(formatter1.parse(m.date))==0) {
                System.out.println("On " + m.date + ", from " + m.stime + " to " + m.etime + " : " + m.title + " : "+ m.description);
            }
        }
    }
}

class Meeting {
    public String title;
    public String date;
    public String stime;
    public String etime;
    public String description;

    public Meeting(String title, String date, String stime, String etime, String description) {
        this.title = title;
        this.date = date;
        this.stime = stime;
        this.etime = etime;
        this.description = description;
    }
}