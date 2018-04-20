package Stage03;
import java.util.*;

public class s02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		
		if(a>0&&a<=100000) {
			for(int i=a;i>0;i--) {
				System.out.println(i);
			}
		}else {
			System.out.println("범위가 틀렸습니다.");
		}
	}

}
