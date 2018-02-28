package Stage02;
import java.util.*;

public class s05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		if(y==0)
			System.out.println("분모는 0이 올 수 없습니다.");
		else
		System.out.println(x%y);

	}

}
