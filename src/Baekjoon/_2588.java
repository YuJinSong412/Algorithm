package Baekjoon;
import java.util.*;

public class _2588 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c;
		String s = Integer.toString(b);
		
		String []n = new String[3];
		
		for(int i=0;i<n.length;i++) {
			n[i] = s.substring(i,i+1);
		}
		for(int i=2;i>=0;i--) {
			c = Integer.parseInt(n[i]);
			System.out.println(a*c);
		}
		System.out.println(a*b);
	}

}
