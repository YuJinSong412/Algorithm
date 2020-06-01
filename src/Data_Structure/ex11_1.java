package Data_Structure;

class Sort{
	public void selectionSort(int a[]) {
		int i,j,l;
		for(i=0;i<a.length-1;i++) {
			l = i;
			for(j=i+1;j<a.length;j++) {
				if(a[l]>a[j])
					l = j;
			}
			swap(a,l,i);
			System.out.printf("\n선택 정렬 %d 단계 : ", i+1);
			for(j=0;j<a.length;j++) {
				System.out.printf("%3d ", a[j]);
			}
			
		}
	}
	
	public void swap(int a[],int i,int j) {
		int temp = a[i];
		a[i]= a[j];
		a[j]= temp;
	}
	
	
}
public class ex11_1 {

	public static void main(String[] args) {
		int a[] = {69,10,30,2,16,8,31,22};
		System.out.printf("\n정렬할 원소 : ");
		for(int i=0;i<a.length;i++)
			System.out.printf("%d ", a[i]);
		System.out.println();
		
		Sort S = new Sort();
		S.selectionSort(a);
	}

}
