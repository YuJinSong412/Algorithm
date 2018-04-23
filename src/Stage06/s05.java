package Stage06;
import java.util.*;

public class s05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int [] grade = new int[5];
		int sum = 0;
		
		for(int i=0;i<grade.length;i++) {
			grade[i] = scanner.nextInt();
			if(grade[i]<40) {
				grade[i] = 40;
			}
			sum += grade[i];
		}
		System.out.println(sum/grade.length);
	}
}
