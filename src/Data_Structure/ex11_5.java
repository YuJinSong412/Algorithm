package Data_Structure;


class Sort5{
	
	public void shellSort(int a[], int size) {
		int interval,i,j,t=0;
		interval = size / 2;
		
		while(interval >= 1) {
			for(i=0;i<interval;i++)
				intervalSort(a,i,size-1,interval);
			System.out.printf("\n셸정렬 %d 단계 : interval = %d >> ",++t,interval);
			
			for(j=0;j<size;j++)
				System.out.printf("%d ", a[j]);
			System.out.println();
			interval /= 2;
		}
	}
	
	public void intervalSort(int a[],int begin, int end, int interval) {
		int i,j,temp;
		for(i=begin;i<interval;i++) {
			temp = a[i];
			if(temp > a[i+interval]) {
				a[i+interval] = temp;
				a[i] = a[i+interval];
			}
		}
	}
}
public class ex11_5 {

	public static void main(String[] args) {
		int a[] = {69,10,30,2,16,8,31,22};
		System.out.printf("\n정렬할 원소 : ");
		for(int i=0;i<a.length;i++)
			System.out.printf("%3d", a[i]);
		System.out.println();
		
		Sort5 s = new Sort5();
		s.shellSort(a,a.length);

	}

}
