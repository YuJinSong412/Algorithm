/*
package Data_Structure;


interface Queue{	//queue에 대한 인터페이스..
	boolean isEmpty(); 	//큐에 대한 특징들...
	void inQueue(char item);
	char deQueue();
	void delete();
	char peek();
}

class ArrayQueue implements Queue{	//큐에 대한 순차 자료구조.
	private int queueSize;
	private int front,rear;
	private char itemArray[];
	
	public ArrayQueue(int queueSize) {
		this.queueSize =queueSize;
		front =0; 
		rear=0;
		itemArray = new char[this.queueSize];
	}
	
	public boolean isEmpty() {
		return (rear == front);
	}
	
	public boolean isFull(){
		return ((rear+1) % (this.queueSize) == front);
	}
	
	public void inQueue(char item) {
		if(isFull()) {
			System.out.println("Inserting fail!");
		}
		else {
			rear = (rear+1) % queueSize;
			itemArray[rear] = item;
			System.out.println("Inserted Item : "+item);
		}
	}
	
	public char deQueue() {
		if(isEmpty()) {
			System.out.println("DeQueue fail!!");
			return 0;
		}
		else {
			front = (front+1) % queueSize;
			return itemArray[front];
		}
	}
	
	public void delete() {
		if(isEmpty()) {
			System.out.println("Deleting fail!!");
			
		}
		else {
			front = (front+1) % queueSize;
		}
	}
	
	public char peek() {
		if(isEmpty()) {
			System.out.println("peeking fail!!");
			return 0;
			
		}
		else {
			return itemArray[(front+1)%queueSize];
		}
	}
	
	public void printQueue() {
		if(isEmpty()) {
			System.out.println("printing fail!!");
		}
		else {
			System.out.printf("Array Circular Queue>> ");
			for(int i=(front+1)%this.queueSize;i != (rear+1) % this.queueSize;i = ++i % this.queueSize ){
				{
					System.out.printf("%c", itemArray[i]);
					System.out.println(); System.out.println();
			}
				
			}
		}
	}
	
}
public class ex8_2 {

	public static void main(String[] args) {
		int queueSize = 4;
		char deletedItem;
		ArrayQueue cQ = new ArrayQueue(queueSize);
		
		cQ.inQueue('A');
		cQ.printQueue();
		
		cQ.inQueue('B');
		cQ.printQueue();
		
		
		deletedItem = cQ.deQueue();
		if(deletedItem != 0)
			System.out.println("deleted Item: "+deletedItem);
		cQ.printQueue();
		
		cQ.inQueue('C');
		cQ.printQueue();
		
		cQ.inQueue('D');
		cQ.printQueue();
		
		cQ.inQueue('E');
		cQ.printQueue();

	}
}
*/