package Stage03;
import java.util.*;

public class s03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		if(a>=1&&a<=9) {
			for(int i=1;i<10;i++) {
				System.out.println(a+" * "+i+" = "+a*i);
			}
		}else {
			System.out.println("범위가 틀렸습니다.");
		}
	}

}
