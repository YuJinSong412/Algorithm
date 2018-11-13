package Baekjoon;
import java.util.*;

public class _1924 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day = scanner.nextInt();
		String[] week = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
		int []day2 = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int sum = day;
		for(int i=0;i<month-1;i++) {
			sum += day2[i];
		}
		if(sum % 7 == 0) {
			sum = 6;
		}
		else {
			sum = sum%7 -1;
		}
		System.out.println(week[sum]);
	}

}
