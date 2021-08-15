import java.util.*;

class Q4 {
    public static int getMaxLen(String S) {
        int n = S.length();
        int maxLength = 1, start = 0;
        for(int i=0;i<n;++i) {
            for(int j=i+1;j<n;++j) {
                int flag = 1;
                for(int k=0;k<(j-i+1)/2;++k) {
                    if(S.charAt(i+k) != S.charAt(j-k))
                        flag = 0;
                }
                if(flag!=0 && (j-i+1)>maxLength){
                    start = i;
                    maxLength = j-i+1;
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String S = scan.nextLine();
        System.out.println("Max length palindrome substring: " + getMaxLen(S));
    }
}