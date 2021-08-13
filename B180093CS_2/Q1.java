import java.util.*;

class Q1 {
    public static void removeDuplicates(ArrayList<Integer> arr) {
        int i = 0;
        while(i < arr.size()-2) {
            //System.out.println(arr);
            int j = i+1;
            int elet_i = arr.get(i);
            if(j < arr.size() && elet_i != arr.get(j)) {
                ++i;
                continue;
            } else {
                ++j;
            }
            while(j < arr.size()) {
                if (arr.get(j) == elet_i) {
                    arr.remove(j);
                    //System.out.println(arr);
                } else {
                    i = j;
                    break;
                }
            } 
        }   
    }

    public static void main(String args[]) {
        ArrayList<Integer> arr;
        Scanner scan = new Scanner(System.in);
        arr = new ArrayList<Integer>();
        for(int i=0; i<13; ++i) {
            arr.add(scan.nextInt());
        }
        System.out.println("The length of the original array is: " + arr.size());
        removeDuplicates(arr);
        System.out.println("After removing duplicates, the new length of the array is: " + arr.size());
    }
}
