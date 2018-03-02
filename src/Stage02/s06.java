package Stage02;
import java.util.*;

public class s06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		
		if(C == 0) 
			System.out.println("0으로 나눌 수 업습니다.");
		System.out.println((A+B)%C);
		
		if(C == 0) 
			System.out.println("0으로 나눌 수 업습니다.");
		System.out.println((A%C + B%C)%C);

		if(C == 0) 
			System.out.println("0으로 나눌 수 업습니다.");
		System.out.println((A*B)%C);
		
		if(C == 0) 
			System.out.println("0으로 나눌 수 업습니다.");
		System.out.println((A%C * B%C)%C);
	}

}
