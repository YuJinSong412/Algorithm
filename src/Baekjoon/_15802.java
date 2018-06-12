package Baekjoon;
import java.util.*;

public class _15802 {

	public static void main(String[] args) {
		int [][]arr = new int[7][7];
		Scanner scanner = new Scanner(System.in);
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				int temp = scanner.nextInt();
				arr[i][j]=temp;
			}
		}
		for(int k =0; k< 7; k++) {
			for(int i=0;i<7;i++) {
				if(i == k)continue;
				for(int j=0;j<7;j++) {
					if(j ==k || j ==i)continue;
					if(arr[i][j] > (arr[i][k] + arr[k][j])) {
						arr[i][j] =  (arr[i][k] + arr[k][j]);
					}
				}
			}
			
		}
	
		
		
		for(int i=0;i<7;i++) {
			for(int j=0;j<7;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
