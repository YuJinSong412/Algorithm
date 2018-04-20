package Stage03;
import java.util.*;

public class s10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String str = scanner.next();
		
		int change;
		int sum =0;
		String temp;
		for(int i=0;i<n;i++) {
			temp = str.substring(i, i+1);
		    change = Integer.parseInt(temp);
		    sum += change;
		}
	System.out.println(sum);
	
	}

}
