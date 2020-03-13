package Baekjoon;
import java.util.Scanner;

public class _2775 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 int test = scanner.nextInt();
		  
		 for(int i=0;i<test;i++){
			  
			  int k = scanner.nextInt();
			  int n = scanner.nextInt();
			  
			  System.out.println(cal(k,n));
				
		 }
		  
	  }
	  static int cal(int i, int j) {
		  if (i == 0)
	           return j;
	      else if (j == 1)
	           return 1;
	      else {
	          return cal(i, j - 1) + cal(i - 1, j);
	      }
	  }
}
