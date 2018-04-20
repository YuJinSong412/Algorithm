package Stage02;
import java.util.*;

public class s07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if((a>0&&a<10)&&(b>0&&b<10)) {
			System.out.println(a+b);
		}else {
			System.out.println("a,b의 범위가 틀렸습니다.");
		}
	}
}
