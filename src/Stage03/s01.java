package Stage03;
import java.util.*;

public class s01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		if(N>100000)
			System.out.println("숫자를 초과했습니다.");
		for(int i=1;i<=N;i++) {
			System.out.println(i);
		}
	}
}
