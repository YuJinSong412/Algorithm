package Data_Structure;

class QNode11{
	int data;
	QNode11 link;
}

class Queue11{
	QNode11 front;
	QNode11 rear;
	
	private QNode11 head[] = new QNode11[10];
	
	public Queue11(){
		front = null;
		rear = null;
	}
	
	public boolean isEmpty() {
		return (front==null);
	}
	
	public void enQueue(int data) {
		QNode11 newNode = new QNode11();
		newNode.data = data;
		newNode.link = null;
		
		int temp = newNode.data % 10;
		
		newNode.link = head[temp];
		head[temp] = newNode;
		
		
	}
	
	public void printQueue() {
		QNode11 Q = new QNode11();
		
		for(int i=0;i<10;i++) {
			System.out.printf("\n");
			Q = head[i];
			while(Q != null) {
				System.out.printf(" -> %d", Q.data);
				Q = Q.link;
			
			}
		}
	}
	
	public int deQueue() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Queue is empty!!");
			return 0;
		}
		else {
			int temp = front.data;
			front = front.link;
			if(front == null)
				rear = null;
			return temp;
		}
	}
}

class Sort8{
	
	public void radixSort(int a[], int size) {
		int i,j;
		Queue11 Q = new Queue11();
		
		for(i=0;i<a.length;i++) {
			Q.enQueue(a[i]);
		}
		
		Q.printQueue();
		
		
	}
}
public class ex11_8 {

	public static void main(String[] args) {
		
		int a[] = {69,10,30,2,16,8,31,22};
		System.out.printf("\n 정렬할 원소 : ");
		for(int i=0;i<a.length;i++)
			System.out.printf("%d ", a[i]);
		
		Sort8 S = new Sort8();	//메모리 할당해줌 쏘트에 관련..
		S.radixSort(a,a.length);	//기수 정렬하기..배열넘기고, 배열 길이 넘기
	}

}
