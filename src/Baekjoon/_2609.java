package Baekjoon;
import java.util.*;

public class _2609 {

	
	public static int calc(int a, int b) {
		
		if(b==0)return a;
		
		else {
			if(a>b) {
				return calc(b,a%b);
			}else {
				return calc(b,b%a);
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int res;

		
	
		if(a>b) {
			res = calc(a,b%a);
		}else {
			res = calc(b,a%b);
		}
		System.out.println(res);
		System.out.println(a*b/res);
	}
}
