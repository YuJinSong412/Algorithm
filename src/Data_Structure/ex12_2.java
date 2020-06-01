package Data_Structure;
//이진탐색 
class Search2{
	int i=0;
	public void binarySearch(int a[],int low, int high,int key) {
		++i;
		int middle = (low+high) /2;
		
		if(a[middle] == key)
			System.out.printf("%d ",i);
		else if(key < a[middle]) {
			binarySearch(a,low,middle-1,key);
		}
		else if(key > a[middle]) {
			binarySearch(a,middle+1,high,key);
		}
		else
			System.out.printf("xx");
		
		
		
	}
}
public class ex12_2 {

	public static void main(String[] args) {
		int a1[] = {1,2,8,9,11,19,29};
		int size = a1.length;
		Search2 S = new Search2();
		S.binarySearch(a1,0,size-1,2);
		
	}

}
