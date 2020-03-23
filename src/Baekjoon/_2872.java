package Baekjoon;
import java.util.ArrayList;
import java.util.Scanner;

public class _2872 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> books = new ArrayList<>();
		
		int num = scanner.nextInt();
		
		for(int i=0;i<num;i++) {
			int book = scanner.nextInt();
			books.add(book);
		}
		

		int checkingNum = num;
		int ans = 0;
		
		for(int i=num-1;i>=0;i--) {
			if(books.get(i) == checkingNum) {
				checkingNum--;
			}
			else {
				ans++;
			}
		}
		System.out.println(ans);
		
	}

}