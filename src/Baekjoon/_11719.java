package Baekjoon;
import java.util.*;

public class _11719 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int j =0;
		while(scanner.hasNextLine()) {
			if(j==100)
				break;
			String text = scanner.nextLine();
			
			if (text.length() > 100)
				break;
			for (int i = 0; i < text.length(); i++) {
				if (text.charAt(i) < 97 && text.charAt(i) > 122) {
					break;
				}
				if (text.charAt(i) < 65 && text.charAt(i) > 90) {
					break;
				}
				if (text.charAt(i) < 48 && text.charAt(i) > 57) {
					break;
				}
			}
			System.out.println(text);
			j++;
		}
	}
}
