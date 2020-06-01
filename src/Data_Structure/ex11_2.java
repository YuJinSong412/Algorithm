package Data_Structure;


class Sort2{
	public void bubbleSort(int a[]) {
		int i,j,temp;
		for(i=a.length-1;i>0;i--) {
			System.out.printf("\n버블 정렬 %d 단계 : ", a.length-i);
			for(j=0;j<i;j++) {
				if(a[j]>a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
				System.out.printf("\n\t");
				for(int k=0;k<a.length;k++)
					System.out.printf("%3d ",a[k]);
			}
		}
	}
}
public class ex11_2 {

	public static void main(String[] args) {
		int a[] = {69,10,30,2,16,8,31,22};
		System.out.printf("\n정렬할 원소 : ");
		for(int i=0;i<a.length;i++)
			System.out.printf(" %d",  a[i]);
		System.out.println();
		
		Sort2 s = new Sort2();
		s.bubbleSort(a);

	}

}
