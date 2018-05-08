package Baekjoon;
import java.util.*;

public class _2420 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		long a = scanner.nextInt();
		long b = scanner.nextInt();
		
		long result = a-b;
		
		if(result<0) {
			result = -result;
		}

		System.out.println(result);
	}

}
