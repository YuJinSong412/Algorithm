package Data_Structure;


class Node{		//노드 
	String data;
	Node link;
}

class LinkedList{
	private Node head;
	
	public LinkedList() {
		head = null;
	}
	public void insertLastNode(String data) {	//마지막 노드로 삽입하기.
		Node newNode = new Node();
		newNode.data = data;
		
		if(head == null) {
			newNode.link = null;
			head = newNode;
		}
		else {
			newNode.link = null;
			Node temp = head;
			while(temp.link != null) {
				temp = temp.link;
			}
			temp.link = newNode;
		}
	}
	
	public void insertMiddleNode(Node pre,String data) {	//중간 노드로 삽입하기.
		Node newNode = new Node();
		newNode.data = data;
		newNode.link = pre.link;
		pre.link = newNode;
	}
	
	public Node SearchNode(String data) {	//노드 찾기.
		Node temp = this.head;
		while(temp!=null) {
			if(temp.data == data)
				return temp;
			else
				temp = temp.link;
		}
		return temp;
	}
	
	public void deleteLastNode() {		//마지막 노드 삭제하기.
		Node pre,temp;
		if(head == null) return;
		if(head.link == null) {
			head = null;
		}
		else {
			pre = head;
			temp = head.link;
			while(temp.link != null) {
				pre = temp;
				temp = temp.link;
			}
			pre.link = null;
			
		}
	}
	public void printList() {	
		Node temp = this.head;
		System.out.printf("L = (");
		
		while( temp!= null ) {
			System.out.printf(temp.data);
			temp = temp.link;
			if(temp!=null) {
				System.out.printf(", ");
			}
		}
		System.out.println(")");
	}
}
public class Practice {

	public static void main(String[] args) {
		LinkedList L = new LinkedList();
		System.out.println("(1) 공백 리스트에 노드 3개 삽입하기");
		L.insertLastNode("월");
		L.insertLastNode("수");
		L.insertLastNode("일");
		L.printList();
		
		System.out.println("(2) 수 노드 뒤에 금 노드 삽입하기");
		Node pre = L.SearchNode("수");
		if(pre == null)
			System.out.println("검색실패 >>찾는 데이터가 없습니다.");
		else {
			L.insertMiddleNode(pre,"금");
			L.printList();
		}
		
		System.out.println("(3) 리스트의 마지막 노드 삭제하기");
		L.deleteLastNode();
		L.printList();
		
	}

}
