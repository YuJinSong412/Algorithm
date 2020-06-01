package Data_Structure;

class DQNode{
	char data;
	DQNode llink, rlink;
}

class DQueue{
	DQNode front, rear;
	
	public DQueue() {
		front = null;
		rear = null;
	}
	
	public boolean isEmpty() {
		return (front == null);
	}
	
	public void insertFront(char item) {
		DQNode newNode = new DQNode();
		newNode.data = item;
		if(isEmpty()) {
			front = newNode;
			rear = newNode;
			newNode.llink = null;
			newNode.rlink = null;
		}
		else {
			newNode.llink = null;
			newNode.rlink = front;
			front.llink = newNode;
			front = newNode;
		}
		System.out.println("Front Inserted Item: "+item);
	}
	public void insertRear(char item) {
		DQNode newNode = new DQNode();
		newNode.data = item;
		if(isEmpty()) {
			front = newNode;
			rear = newNode;
			newNode.llink = null;
			newNode.rlink = null;
		}
		else {
			rear.rlink = newNode;
			newNode.llink = rear;
			newNode.rlink = null;
			rear = newNode;
		}
		System.out.println("Rear Inserted Item : "+item);
	}
	
	public char deleteFront() {
		if(isEmpty()) {
			System.out.println("Front deleting fail!");
			return 0;
		}
		else {
			char item = front.data;
			if(front.rlink == null) {
				front = null;
				rear = null;
			}
			else {
				front = front.rlink;
				front.llink = null;
			}
			return item;
		}
	}
	
	public char deleteRear() {
		if(isEmpty()) {
			System.out.println("rear deleting fail!");
			return 0;
		}
		else {
			char item = rear.data;
			if(rear.llink == null) {
				rear = null;
				front = null;
			}
			else {
				rear = rear.llink;
				rear.rlink = null;
			}
			return item;
		}
	}
	
	public void removeFront() {
		if(isEmpty()) {
			System.out.println("Front deleting fail!");
			
		}
		else {
			
			if(front.rlink == null) {
				front = null;
				rear = null;
			}
			else {
				front = front.rlink;
				front.llink = null;
			}
			
		}
	}
	
	public void removeRear() {
		if(isEmpty()) {
			System.out.println("rear deleting fail!");
			
		}
		else {
			
			if(rear.llink == null) {
				rear = null;
				front = null;
			}
			else {
				rear = rear.llink;
				rear.rlink = null;
			}
			
		}
	}
	
	
	public char peekFront() {
		if(isEmpty()) {
			System.out.println("peeking fail!");
			return 0;
		}
		else {
			return front.data;
		}
	}
	
	public char peekRear() {
		if(isEmpty()) {
			System.out.println("peeking fail!");
			return 0;
		}
		else {
			return rear.data;
		}
	}
	
	public void printQueue() {
		if(isEmpty())
			System.out.println("DQueue is empty!! %n %n");
		else {
			DQNode temp = front;
			System.out.printf("DQueue >> ");
			while(temp != null) {
				System.out.printf("%c",  temp.data);
				temp = temp.rlink;
			}
			System.out.println(); System.out.println();
		}
	}
	
}

public class ex8_4 {

	public static void main(String[] args) {
		
		char deletedItem;
		DQueue DQ = new DQueue();
		
		DQ.insertFront('A');
		DQ.printQueue();
		
		DQ.insertFront('B');
		DQ.printQueue();
		
		DQ.insertRear('C');
		DQ.printQueue();
		
		deletedItem = DQ.deleteFront();
		if(deletedItem != 0)
			System.out.println("Front delted ITem : ");
		DQ.printQueue();
		
		DQ.insertRear('D');
		DQ.printQueue();
		
		DQ.insertFront('E');
		DQ.printQueue();
		
		DQ.insertFront('F');
		DQ.printQueue();

	}

}
