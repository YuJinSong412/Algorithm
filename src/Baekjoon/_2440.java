package Baekjoon;
import java.util.*;

public class _2440 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		for(int i=0;i<N;i++) {
			for(int j=N;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
