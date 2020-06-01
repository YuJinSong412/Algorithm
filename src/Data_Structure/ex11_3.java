package Data_Structure;

class Sort3{
	int i=0;
	public void quickSort(int a[],int begin, int end) {
		if(begin < end) {
			int p;
			p=partition(a,begin,end);
			
			quickSort(a,begin,p-1);
			quickSort(a,p+1,end);
		}
	}
	
	public int partition(int a[],int begin, int end) {
		int L,R,pivot,temp,t;

		L = begin;
		R = end;
		pivot = (begin + end) /2;
		System.out.printf("\n[퀵정렬 %d 단계 : pivot= %d ]", ++i,a[pivot]);
		
		while(L < R) {
			while((a[L] < a[pivot]) && (L < R)) L++;
			while((a[R] >= a[pivot]) && (L < R)) R--;
			
			if(L < R) {
				temp = a[L];
				a[L] = a[R];
				a[R] = temp;
				
				if(L == pivot) {
					for(t=0;t<a.length;t++)
						System.out.printf("%3d ", a[t]);
					System.out.println();
					
					return R;
				}
			}
		}
		temp = a[pivot];
		a[pivot] = a[R];
		a[R] = temp;
		for(t=0;t<a.length;t++)
			System.out.printf("%3d ", a[t]);
		System.out.println();
		return R;
	}
	
	
}
public class ex11_3 {

	public static void main(String[] args) {
		int a[] = {69,10,30,2,16,8,31,22};
		System.out.printf("\n정렬할 원소 : ");
		for(int i=0;i<a.length;i++)
			System.out.printf("%3d", a[i]);
		System.out.println();

		Sort3 s = new Sort3();
		s.quickSort(a,0,7);
	}

}
