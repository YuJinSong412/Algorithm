package Stage02;
import java.util.*;

public class s07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		if(x+y>=10)
			System.out.println("초과했습니다.");
		System.out.println(x+y);
	}
}
