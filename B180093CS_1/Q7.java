import java.util.*;

class Q7 {
    public static int[] fibonacci(int N) {
        int array[];
        array = new int[N];
        array[0] = 0;
        array[1] = 1;
        for(int i=2;i<N;++i) {
            array[i] = array[i-1] + array[i-2];
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("N: ");
        int N = scan.nextInt();
	if(N>1){
        	int [] array = fibonacci(N);
		System.out.println(Arrays.toString(array));
	}
	else{
		if(N == 1)
			System.out.println("[0]");
		else
			System.out.println("Invalid number");
	}
        
    }
}
