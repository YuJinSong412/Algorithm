package Baekjoon;
import java.util.*;

public class _5543 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int burger[] = new int[3];
		int drink[] = new int[2];
		int min=9999, b=0;
		
		for(int i=0;i<burger.length;i++) {
			burger[i] = scanner.nextInt();
			
			if(min>burger[i]) {
				min = burger[i];
			}
		}
		for(int i=0;i<drink.length;i++) {
			drink[i] = scanner.nextInt();
			if(drink[0]>drink[1]) {
				b = drink[1];
			}else {
				b = drink[0];
			}
		}
		System.out.println(min+b-50);

	}

}
