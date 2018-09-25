package Baekjoon;
import java.util.*;

public class _1546 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int num = scanner.nextInt();
		int []score = new int[num];
		for(int i=0;i<score.length;i++) {
			score[i] = scanner.nextInt();
		}
		Arrays.sort(score);
		
		double result=0,sum=0;
		for(int i=0;i<score.length;i++) {
			result= (double)score[i]/score[num-1]*100;
			sum += result;
		}
		System.out.println((double)sum/num);
	}
}
