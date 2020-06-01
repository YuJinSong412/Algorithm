package Data_Structure;


class Sort6{
	private int sorted[] = new int[30];
	
	public void mergeSort(int a[], int m, int n) {
		int middle;
		if(m<n) {
			middle = (m+n) /2;
			mergeSort(a,m,middle);
			mergeSort(a,middle+1,n);
			merge(a,m,middle,n);
		}
	}
	
	//부분 배열을 정렬하면서 병합하는 작업을 반복하여 하나의 전체 배열을 완성한다.
	public void merge(int a[],int m, int middle, int n) {
		int size = a.length;
		int i,j,k;
		i=m;
		k=n;
		j=middle+1;
		
		while(i<=middle && j<=n) {
			if(a[i]<=a[j]) sorted[k] = a[i++];
		}
	}
}
public class ex11_6 {

	public static void main(String[] args) {
		int a[] = {69,10,30,2,16,8,31,22};
		System.out.printf("\n정렬할 원소 : ");
		for(int i=0;i<a.length;i++)
			System.out.printf("%3d", a[i]);
		System.out.println();
		
		Sort6 s = new Sort6();
		s.mergeSort(a,0,a.length-1);

	}

}
