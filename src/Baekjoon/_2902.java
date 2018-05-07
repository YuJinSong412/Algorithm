package Baekjoon;
import java.util.*;

public class _2902 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String a = scanner.nextLine();
		
		String b[] = a.split("-");
		
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i].charAt(0));
		}

	}

}
