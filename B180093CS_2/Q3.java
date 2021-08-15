import java.util.*;

class Q3 {
    public static void main(String args[]) {
        String S;
        boolean[] alphabets = new boolean[128];
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scan.nextLine());

        for(int i = 0; i <sb.length(); ++i) {
            char ch = sb.charAt(i);
            if(alphabets[ch] == true)
                sb.deleteCharAt(i);
            else 
                alphabets[ch] = true;
        }
        
        System.out.print(sb.toString());
    }
}