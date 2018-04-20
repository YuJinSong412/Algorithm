package Stage03;
import java.util.*;

public class s09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum=0;
		
		if(n>=1&&n<=10000) {
			for(int i=1;i<=n;i++) {
				sum += i;
			}
			System.out.println(sum);
		}

	}

}
