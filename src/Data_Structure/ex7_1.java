/*package Data_Structure;


interface Stack{	//stack	인터페이스 틀을 잡아줌.상수랑 추상메소드만 가능함.
	boolean isEmpty();
	void push(char item);
	char pop();
	void delete();
	//char peek();
}

class ArrayStack implements Stack{
	private int top;
	private int stackSize;
	private char itemArray[];
	
	public ArrayStack(int stackSize) {
		top = -1;
		this.stackSize = stackSize;
		itemArray = new char[this.stackSize];
	}
	public boolean isEmpty() {
		return (top == -1);
	}
	public boolean isFull() {
		return (top == this.stackSize - 1);
	}
	public void push(char item) {
		top += 1;
		
		if(isFull()) {
			System.out.println("Inserting fail! Array Stack is full!!");
		}
		else {
			itemArray[top] = item;
			System.out.println("Inserted Item: "+item);
		}
	}
	public char pop() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Array Stack is empty!!");
			return 0;
		}
		else {
			return itemArray[top--];
		}
	}
	
	public void delete() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Array Stack is empty!!");
		}
		else {
			top--;
		}
	}
	public void printStack() {
		if(isEmpty())
			System.out.printf("Array Stack is empty!! %n %n");
		else {
			System.out.printf("Array Stack>> ");
			for(int i=0;i<=top;i++)
				System.out.printf("%c ", itemArray[i]);
			System.out.println();
			System.out.println();
		}
	}
}

public class ex7_1 {

	public static void main(String[] args) {
		int stackSize = 5;
		char deletedItem;
		ArrayStack s = new ArrayStack(stackSize);
		
		s.push('A');
		s.printStack();

		s.push('B');
		s.printStack();

		s.push('C');
		s.printStack();
		
		deletedItem = s.pop();
		if(deletedItem != 0)
			System.out.println("deleted Item: "+deletedItem);
		s.printStack();

	}

}
*/