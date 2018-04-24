package Stage02;

import java.util.*;

public class s08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

	    int y = N/5;
		int x = (N-5*y);
	   
		
		if(N==7 || N==4) {
			System.out.println(-1);
		}
		else if(x % 3 ==0) {
			System.out.println(x/3+y);
		}
		else{
			y -=1;
			x +=5;
		
			if(x%3==0) {
				System.out.println(x/3+y);
			}else if(x%3!=0) {
				y = y-1;
				x = (N-5*y);
				if(x%3==0) {
					System.out.println(x/3+y);
				}
			}
		}
			
	}

}
