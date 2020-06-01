package Data_Structure;

interface Queue2{	//queue에 대한 인터페이스..
	boolean isEmpty(); 	//큐에 대한 특징들...
	void inQueue(char item);
	char deQueue();
	void delete();
	char peek();
}

class LinkedQueue implements Queue2{
	QNode rear, front;
	
	public LinkedQueue() {
		rear = null;
		front = null;
	}
	
	public boolean isEmpty() {
		return (front == null);	//연결된 노드가 하나도 없다는 뜻이므로 front 가 null이 되어야 한다.
	}
	
	public void inQueue(char item) {
		QNode newNode = new QNode();
		newNode.data = item;
		newNode.link = null;
		
		if(isEmpty()) {
			front = newNode;
			rear = newNode;
		}
		else {
			rear.link = newNode;
			rear = newNode;
			System.out.println("Inserted Item: "+ item);
		}
	}
	
	public char deQueue() {
		if(isEmpty()) {
			System.out.println("deleting fail!!");
			return 0;
		}
		else {
			char item = front.data;
			front = front.link;
			if(front == null)
				rear = null;
			return item;
		}
	}
	
	public void delete() {
		if(isEmpty()) {
			System.out.println("deleting fail!!");
			
		}
		else {
			front = front.link;
			if(front == null)
				rear = null;
			
		}
	}
	
	public char peek() {
		if(isEmpty()) {
			System.out.println("peeking fail!!");
			return 0;
			
		}
		else {
			return front.data;
		}
	}
	
	public void printQueue() {
		if(isEmpty()) {
			System.out.println("printing fail!!");
		}
		else {
			QNode temp = front;
			System.out.printf("Linked Queue>> ");
			while(temp != null) {
				System.out.printf("%c ", temp.data);
				temp = temp.link;
			}
			System.out.println(); System.out.println();
		}
	}
}

class QNode{
	char data;
	QNode link;
}

public class ex8_3 {

	public static void main(String[] args) {
		char deletedItem;
		LinkedQueue LQ = new LinkedQueue();
		
		LQ.inQueue('A');
		LQ.printQueue();
		
		LQ.inQueue('B');
		LQ.printQueue();
		
		deletedItem = LQ.deQueue();
		if(deletedItem != 0)
			System.out.println("deleted Item: "+deletedItem);
		LQ.printQueue();
		
		LQ.inQueue('C');
		LQ.printQueue();
		
		deletedItem = LQ.deQueue();
		if(deletedItem != 0)
			System.out.println("deleted Item: "+deletedItem);
		LQ.printQueue();
		
		deletedItem = LQ.deQueue();
		if(deletedItem != 0)
			System.out.println("deleted Item: "+deletedItem);
		LQ.printQueue();
		
		deletedItem = LQ.deQueue();
		if(deletedItem != 0)
			System.out.println("deleted Item: "+deletedItem);
		LQ.printQueue();

	}

}
