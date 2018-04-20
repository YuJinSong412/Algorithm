package Stage04;
import java.util.*;

public class s02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int max = 0,mid =0;
		
		int num[] = new int[3];
		for(int i=0;i<3;i++) {
			num[i] = scanner.nextInt();
		}
		
		max = num[0];
		for(int i=1;i<3;i++) {
			if(max <num[i]) {
				mid = max;
				max = num[i];			
			}
			else if(max == num[i])
				mid = num[i];
			else if(max > num[i] )
				mid = num[i];
		}
		
		//System.out.println(mid);
	}
	
}
