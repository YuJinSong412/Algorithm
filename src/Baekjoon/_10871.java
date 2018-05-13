package Baekjoon;
import java.util.*;

public class _10871 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int X = scanner.nextInt();
		int []num = new int[N];
		
		for(int i=0;i<num.length;i++) {
			num[i]=scanner.nextInt();
			if(X>num[i]) {
				System.out.print(num[i]+" ");
			}
		}

	}

}
