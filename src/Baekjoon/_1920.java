package Baekjoon;
import java.util.*;

public class _1920 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int result=0;
		
		int n = scanner.nextInt();
		
		int n_arr[] = new int[n];
		for(int i=0;i<n_arr.length;i++) {
			n_arr[i] = scanner.nextInt();
		}
		
		int m = scanner.nextInt();
		
		int m_arr[] = new int[m];
		for(int i=0;i<m_arr.length;i++) {
			m_arr[i]=scanner.nextInt();
		}
		
		int num[] = new int[m];
		for(int i=0;i<num.length;i++) {
			num[i]=0;
		}
		for(int i=0;i<n_arr.length;i++) {
			for(int j=0;j<n_arr.length;j++) {
				if(m_arr[i]==n_arr[j]) {
					num[i]=1;
				}
			}
		}
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
	}

}
