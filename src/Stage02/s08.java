package Stage02;

import java.util.*;

public class s08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		if(N==4 || N==7)
			System.out.println("-1");
		else if ((N % 5) % 3 == 0 )
			System.out.println((N / 5)+(N % 5)/3);
		else if ((N % 3) == 0) 
			System.out.println(N/3);
		else if((N%5)%3 != 0) {
			System.out.println(((N/5)-1)+(N-((N/5)-1)*5)/3);
		}
	}

}
