import java.util.*;

class Q5 {

    public static void swap(long[] array, int i, int j) {
        long k = array[i];
        array[i] = array[j];
        array[j] = k;
    }

    public static int partition(long[] array, int l, int r) {
        long pivot = array[r];
        int i = l-1;
        for(int j = l; j < r; ++j) {
            if(array[j] > pivot) {
                ++i;
                swap(array, i, j);
            }
        }
        ++i;
        swap(array, i, r);
        return i;
    }

    public static void quickSort(long[] array, int n1, int n2) {
        if(n1 < n2) {
            int pivot_index = partition(array, n1, n2);
            quickSort(array, n1, pivot_index-1);
            quickSort(array, pivot_index+1, n2);
        }
    }

    public static void main(String args[]) {
        long[] array;
        Scanner scan = new Scanner(System.in);
        System.out.println("Array length: ");
        int N = scan.nextInt();
        array = new long[N];
        System.out.println("Array Elements: ");
        for(int i = 0;i  < N; ++i) {
            array[i] = scan.nextLong();
        }
        quickSort(array, 0, N-1);
        //Arrays.sort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}