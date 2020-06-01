/*package Data_Structure;

interface stack{
	boolean isEmpty();
	void push(char data);
	char pop();
	void delete();
	char peek();
}

class StackNode{
	char data;
	StackNode link;
}

class LinkedStack implements stack{
	private StackNode top;
	
	public boolean isEmpty() {
		return (top == null);
	}
	public void push(char data) {
		StackNode newNode = new StackNode();
		newNode.data = data;
		newNode.link = top;
		top = newNode;
		System.out.println("Inserted Item : "+ data);
		
	}
	public char pop() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Stack is empty!!");
			return 0;
		}
		else {
			char item = top.data;
			top = top.link;
			return item;
		}
	}
	public void delete() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Stack is empty!!");
		}
		else {
			top = top.link;
		}
	}
	
	public char peek() {
		if(isEmpty()) {
			System.out.println("peeking fail! Linked Stack is empty!!");
			return 0;
		}
		else {
			return top.data;
		}
	}
	
	public void printStack() {
		if(isEmpty())
			System.out.println("Linked Stack is empty!! %n %n");
		else {
			StackNode temp = top;
			System.out.println("Linked Stack>> ");
			while(temp != null) {
				System.out.printf("\t %c \n", temp.data);
				temp = temp.link;
			}
			System.out.println();
		}
	}
	
}

public class ex7_2 {

	public static void main(String[] args) {
		char deletedItem;
		LinkedStack LS = new LinkedStack();
		
		LS.push('A');
		LS.printStack();
		
		LS.push('B');
		LS.printStack();
		
		LS.push('C');
		LS.printStack();
		
		deletedItem = LS.pop();
		if(deletedItem != 0)
			System.out.println("deleted Item: "+deletedItem);
		LS.printStack();

	}

}
*/