package Stage03;
import java.util.*;

public class s07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		if(a>=1&&a<=100) {
			for(int i=0;i<a;i++) {
				for(int j=0;j<i;j++) {
					System.out.print(" ");
				}
				for(int j=a;j>i;j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

	}

}
