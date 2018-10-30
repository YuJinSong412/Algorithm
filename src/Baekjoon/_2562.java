package Baekjoon;
import java.util.*;

public class _2562 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[9];
		
		int max = 0,n=0;
		for(int i=0;i<arr.length;i++) {
			arr[i] = scanner.nextInt();
			if(max<arr[i]) {
				max = arr[i];
				n=i;
			}
		}
		System.out.print(max+"\n"+(n+1));
	}
}

