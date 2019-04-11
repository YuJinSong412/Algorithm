import java.util.*;

public class assignment {

	public static void main(String[] args) {
		int[] list = {1,6,3,4,8,10};
		
		int[] array_min = new int[3];
		int[] array_max = new int[3];
		int j =0;
		int max = array_max[0];
		int min = array_min[0];
		
		for(int i=0;i<list.length;i++) {
			if(i % 2 == 0) {
				if(list[i]>= list[i+1]) {
					array_max[j]=list[i];
					array_min[j]=list[i+1];
					j++;
				}
				else if(list[i]<list[i+1]) {
					array_max[j]=list[i+1];
					array_min[j]=list[i];
					j++;
				}
			}
			else if(i % 2 != 0)
				continue;
		}
		
		for(int i=0;i<3;i++) {
			if(min>array_min[i]) {
				min = array_min[i];
			}
		}
		
		for(int i=0;i<3;i++) {
			if(max<array_max[i]) {
				max = array_max[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}

}


// n개의 숫자 목록에서 가장 작은 숫자와 가장 큰 숫자를 모두 찾는 알고리즘을 작성한다.
// 어레이 항목을 최대 1.5n 비교하는 방법을 찾아보십시오.