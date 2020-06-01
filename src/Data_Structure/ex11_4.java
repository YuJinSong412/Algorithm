package Data_Structure;

class Sort4{
	public void insertionSort(int a[], int size) {
		int i,j,temp,t;
		
		for(i = 1;i<size;i++) {
			temp = a[i];
			j = i;
			while((j>0)&&(a[j-1] > temp)) {
				a[j] = a[j-1];
				j--;
			}
			a[j] = temp;
			System.out.printf("\n삽입정렬 %d 단계 : ",i);
			for(t=0;t<size;t++)
				System.out.printf("%3d ", a[t]);
		}
		System.out.println();
	}
}
public class ex11_4 {

	public static void main(String[] args) {
		int a[] = {69,10,30,2,16,8,31,22};
		System.out.printf("\n정렬할 원소 : ");
		for(int i=0;i<a.length;i++)
			System.out.printf("%3d", a[i]);
		System.out.println();
		
		Sort4 s = new Sort4();
		s.insertionSort(a,a.length);

	}

}
