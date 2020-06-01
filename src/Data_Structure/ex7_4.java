/*
package Data_Structure;

class StackNode{
	int data;
	StackNode link;
}

class LinkedStack{
	private StackNode top;
	
	public boolean isEmpty() {
		return (top == null);
	}
	public void push(int item) {
		StackNode newNode = new StackNode();
		newNode.data = item;
		newNode.link = top;
		top = newNode;
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Stack is empty!!");
			return 0;
		}
		else{
			int item = top.data;
			top = top.link;
			return item;
		}
	}
}

class OptExp{
	private String exp;
	
	public int evalPostfix(String exp) {
		LinkedStack S = new LinkedStack();
		this.exp = exp;
		int opr1,opr2,value;
		char testCh;
		
		for(int i=0;i<7;i++) {
			testCh = exp.charAt(i);
			if(testCh!='+' && testCh!='-' && testCh!='*' && testCh!='/') {
				value = testCh - '0';
				S.push(value);
			}
			else {
				opr2 = S.pop();
				opr1 = S.pop();
				switch(testCh) {
				case '+': S.push(opr1+opr2); break;
				case '-': S.push(opr1-opr2); break;
				case '*': S.push(opr1*opr2); break;
				case '/': S.push(opr1/opr2); break;
				
				}
			}
		}
		return S.pop();
		
	}
}

public class ex7_4 {

	public static void main(String[] args) {
		
		OptExp opt = new OptExp();
		int result;
		String exp = "35*62/-";
		System.out.printf("\n후위표기식 : %s",exp);
		result = opt.evalPostfix(exp);
		System.out.printf("\n 연산결과 = %d \n", result);

	}

}
*/