import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

//TOLEARN AND REPLACE
//Reading from file, other methods and how they are efficient
//String s = "hello", if we can do better other than initialising like that
//scan2.close() at the end, if we can do better
public class Q2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String filename = scan.next();
        try {
        File file = new File(filename);
        Scanner scan2 = new Scanner(file);
        while(true) {
            String s = "hello";
            try {
                s = scan2.nextLine();
            } catch(NoSuchElementException e2) {
                scan2.close();
                break;
            }
            String s1[] = s.split("\\D",0);
            if(s1.length != 1)
                System.out.println("OtherCharactersFound");
            else
                System.out.println(s1[0]);
        }
        scan2.close();
        } catch(FileNotFoundException e) {
            System.out.println(e);
        }
        scan.close();
    }
}
