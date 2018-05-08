package Baekjoon;
import java.util.*;

public class _2475 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int []num = new int[5];
		int sum=0;
		
		for(int i=0;i<num.length;i++) {
			num[i] = scanner.nextInt();
			num[i] = num[i]*num[i];
			sum += num[i];
		}
		System.out.println(sum%10);
	}
}
