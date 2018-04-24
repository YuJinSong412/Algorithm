package Stage03;
import java.util.*;

public class s11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean flage = true;
		
		String input = scanner.next();
		
		for(int i=0;i<input.length();i++) {
			if(i%10==0) {
				if(i==0) {
					flage = false;
				}else {
					flage = true;
				}
				if(flage) {
				System.out.println();}
			}
			System.out.print(input.charAt(i));
		}
	}
}
