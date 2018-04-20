package Stage03;
import java.util.*;

public class s05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		
		if(a>=1&&a<=100) {
			for(int i=0;i<a;i++) {
				for(int j=(a-1);j>i;j--) {
					System.out.print(" ");
				}
				for(int j=0;j<(i+1);j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}else {
			System.out.println("범위를 틀렸습니다.");
		}

	}

}
