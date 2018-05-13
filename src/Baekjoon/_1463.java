package Baekjoon;
import java.util.*;

public class _1463 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		int result=0;
		int sum=0;
		
		while(true) {
			if(num%3==0) {
				result = num/3;
				sum+=1;
				System.out.println(sum+"일루왔다22");
				break;
			}
			else if(num%2==0) {
				result = num/2;
				if(result==1) {
					sum += 1;
					System.out.println(sum+"일루왔다");
					break;
				}else if(result!=1) {
					sum += 1;
					System.out.println(result);
					System.out.println(sum);
					continue;
				}
			}
			else {
				num=num-1;
				sum += 1;
				System.out.println(num);
				continue;
			}
		}


	}

}
