package Stage03;
import java.util.*;

public class s04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		if(N>=1&&N<=100) {
			for(int i=0;i<N;i++) {
				for(int j=0;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}else {
			System.out.println("범위가 틀렸습니다.");
		}

	}

}
