package Baekjoon;
import java.util.*;

public class _3009 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int [][]a = new int[3][2];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j] = scanner.nextInt();
			}
		}
		
		if(a[0][0]==a[1][0]) {
			System.out.print(a[2][0]+" ");
		}else if(a[0][0]!=a[1][0]) {
			if(a[0][0]==a[2][0]) {
				System.out.print(a[1][0]+" ");
			}else {
				System.out.print(a[0][0]+" ");
			}
		}
		
		if(a[0][1]==a[1][1]) {
			System.out.print(a[2][1]+" ");
		}else if(a[0][1]!=a[1][1]) {
			if(a[0][1]==a[2][1]) {
				System.out.print(a[1][1]+" ");
			}else {
				System.out.print(a[0][1]+" ");
			}
		}
		
	}

}
