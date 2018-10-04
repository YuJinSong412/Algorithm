package Baekjoon;
import java.util.*;

public class _11720 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String m = scanner.next();
		
		int sum = 0;
		for(int i=0;i<m.length();i++) {
			String a = m.substring(i,i+1);
			int NEW = Integer.parseInt(a);
			sum += NEW;
		}
		System.out.println(sum);
	}

}
