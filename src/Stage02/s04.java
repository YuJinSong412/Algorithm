package Stage02;
import java.util.*;

public class s04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double x = scanner.nextInt();
		double y = scanner.nextInt();
		
		if(y==0)
			System.out.println("분모가 0이면 나눌 수 없습니다.");
		else 
			System.out.println(x/y);
	}

}
