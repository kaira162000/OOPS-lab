import java.util.*;

public class Q6 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        ArrayList<ReferanceBooks> rbs = new ArrayList<>();
        ArrayList<TextBooks> tbs = new ArrayList<>();
        while(true) {
            System.out.print("\nEnter your choice: ");
            switch(scan.nextInt()) {
                case 1: {
                    scan.nextLine();
                    System.out.println("Enter ID, Title and Author (Line by line)");
                    rbs.add(new ReferanceBooks(scan.nextLine(), scan.nextLine(), scan.nextLine()));
                    break;
                }
                case 2: {
                    scan.nextLine();
                    System.out.println("Enter ID, Title and Author (Line by line)");
                    tbs.add(new TextBooks(scan.nextLine(), scan.nextLine(), scan.nextLine()));
                    break;
                }
                case 3: {
                    scan.nextLine();
                    System.out.println("Enter Book ID: ");
                    String id = scan.nextLine();
                    int flag = 0;
                    for(TextBooks tb : tbs) {
                        if(tb.bookID.equals(id)) {
                            flag = 1;
                            System.out.print("Enter username: ");
                            if(!tb.checkIn(scan.nextLine())) {
                                System.out.println("Not available");
                            }
                        }
                    } if(flag == 0) {
                        for(ReferanceBooks rb : rbs) {
                            if(rb.bookID.equals(id)) {
                                rb.checkIn(null);
                                flag = 1;
                            }
                        }
                    }
                    if(flag == 0)
                        System.out.println("No book with given ID");
                    break;
                }
                case 4: {
                    scan.nextLine();
                    System.out.print("Enter Book ID: ");
                    String id = scan.nextLine();
                    for(TextBooks tb : tbs) {
                        tb.checkOut();
                    }
                    for(ReferanceBooks rb : rbs) {
                        if(rb.bookID.equals(id)) {
                            rb.checkOut();
                        }
                    }
                    break;
                }
                case 5: {
                    scan.nextLine();
                    for(ReferanceBooks rb : rbs)
                        System.out.println("ReferanceBook: " + rb.bookID + ": " + rb.title + ": " + rb.author);
                    for(TextBooks tb : tbs) {
                        if(tb.status == "Available")
                            System.out.println("TextBook: " + tb.bookID + ": " + tb.title + ": " + tb.author + ": Available");
                        else 
                        System.out.println("TextBook: " + tb.bookID + ": " + tb.title + ": " + tb.author + ": Borrowed by " + tb.borrowedUser);
                    }
                        
                    break;
                }
                case 6: {
                    scan.close();
                    return ;
                }
            }
        }
    }
}

class TextBooks extends Book {
    String status;
    String borrowedUser;

    TextBooks(String id , String title, String author) {
        this.bookID = id;
        this.title = title;
        this.author = author;
        this.status = "Available";
    }
    public boolean checkIn(String borrowedUser) {
        if(this.status.equals("Available")) {
        this.status = "Not Available";
        this.borrowedUser = borrowedUser;
        return true;
        }
        return false;
    }

    public void checkOut() {
        this.status = "Available";
    }
}

class ReferanceBooks extends Book {
    ReferanceBooks(String id, String title, String author) {
        this.bookID = id;
        this.title = title;
        this.author = author;
    }

    public boolean checkIn(String borrowedUser) {
        System.out.println("Cannot be borrowed");
        return false;
    }

    public void checkOut() {
        System.out.println("Invalid");
    }
}

abstract class Book implements Borrowable{
    String bookID;
    String title;
    String author;

}

interface Borrowable {
    boolean checkIn(String user);
    void checkOut();
}
