package Stage06;
import java.util.*;

public class s02 {

	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		int result=a*b*c;
		
		int [] arr = new int[10];
		//System.out.println(result);

		String change = Integer.toString(result);
		/*
		while(result != 0) {
			arr[result%10]++;
			result /=10;
		}
		*/
		for(int i=0;i<change.length();i++) {
			
			int temp = Integer.parseInt(change.substring(i, i+1));
			arr[temp]++;
			/*
			if(change.charAt(i)=='0') {
				 arr[0]++;
			}
			if(change.charAt(i)=='1') {
				arr[1]++;
			}
			if(change.charAt(i)=='2') {
				arr[2]++;
			}
			if(change.charAt(i)=='3') {
				 arr[3]++;
			}
			if(change.charAt(i)=='4') {
				 arr[4]++;
			}
			if(change.charAt(i)=='5') {
				 arr[5]++;
			}
			if(change.charAt(i)=='6') {
				 arr[6]++;
			}
			if(change.charAt(i)=='7') {
				 arr[7]++;
			}
			if(change.charAt(i)=='8') {
				 arr[8]++;
			}
			if(change.charAt(i)=='9') {
				 arr[9]++;
			}
			*/
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println((arr[i]));
		}
		
	}

}
