import java.util.*;


class Q2 {
    public static void main(String[] args) {
        String S;
        Scanner scan = new Scanner(System.in);
        S = scan.nextLine();
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(S.split("\\s", -1)));
        list.removeAll(Collections.singleton(""));
        System.out.println("Words count is " + list.size());
        for(int i = 0;i<S.length();++i) {
            System.out.println("'" + S.charAt(i) + "'" + " " + (int)S.charAt(i));
        }
    }
}