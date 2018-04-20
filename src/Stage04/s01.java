package Stage04;
import java.util.*;

public class s01 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		int score = scanner.nextInt();
		String result;
		if(score>=0&&score<=100) {
		if(score>=90&&score<=100) {
			result = "A";
		}
		else if(score>=80) {
			result = "B";
		}
		else if(score>=70) {
			result = "C";
		}
		else if(score>=60) {
			result = "D";
		}
		else {
			result = "F";
		}
		System.out.println(result);
		}else {
			System.out.println("범위를 틀렸습니다.");
		}

	}

}
