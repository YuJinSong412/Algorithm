/*package Data_Structure;

public class ex6_1 {

	public static void main(String[] args) {
		LinkedList L = new LinkedList();
		System.out.println("(1) 공백 리스트에 노드 3개 삽입하기 ");
		L.insertLastNode("월");
		L.insertLastNode("수");
		L.insertLastNode("일");
		L.printList();
		
		System.out.println("(2) 수 노드 뒤에 금 노드 삽입하기 ");
		ListNode pre = L.searchNode("수");
		if(pre == null)
			System.out.println("검색 실패 찾는 데이터가 없습니다.");
		else {
			L.insertMiddleNode(pre, "금");
		}
		
		System.out.println("(3) 리스트의 노드를 역순으로 바꾸기");
		L.reverseList();
		L.printList();
		
		System.out.println("(4) 리스트의 마지막 노드 삭제하");
		L.deleteLastNode();
		L.printList();
		
		

	}

}

class LinkedList{
	private ListNode head;
	
	public LinkedList() {
		head = null;
	}
	
	public void insertFirstNode(String data) {
		ListNode newNode = new ListNode(data);
		newNode.link = head.link;
		head = newNode;
		
	}
	public void insertMiddleNode(ListNode pre, String data) {
		ListNode newNode = new ListNode(data);
		newNode.link = pre.link;
		pre.link = newNode;
		
	}
	public void insertLastNode(String data) {
		ListNode newNode = new ListNode(data);
		if(head == null) {
			this.head = newNode;
		}
		else {
			ListNode temp = head;
			while(temp.link != null) {
				temp = temp.link;
			}
			temp.link = newNode;
		}
	}
	public void deleteLastNode() {
		ListNode pre,temp;
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
	public ListNode searchNode(String data) {
		ListNode temp = this.head;
		while(temp != null) {
			if(data == temp.getData())
				return temp; //temp.data 라고 하면 안되는지 확인하기. 
			else
				temp = temp.link;
		}
		return temp;
	}
	public void reverseList() {
		ListNode next = head;
		ListNode current = null;
		ListNode pre = null;
		
		while(next != null) {	//마지막노드까
			pre = current;		//이전을 최선으로 바꾸기.
			current = next;		//최신을 노드에 저장하기.
			next = next.link;	//노드는노노드 링크를 가리킨다.
			current.link = pre;
		}
		head = current;
	}
	public void printList() {
		ListNode temp = this.head;
		System.out.printf("L = (");
		while(temp != null) {
			System.out.printf(temp.getData());
			temp = temp.link;
			if(temp != null) {
				System.out.printf(", ");
			}
		}
		System.out.println(")");
	}
	
}

class ListNode{
	private String data;
	public ListNode link;
	
	public ListNode() {
		this.data = null;
		this.link = null;
	}
	public ListNode(String data) {
		this.data = data;
		this.link = null;
	}
	public ListNode(String data, ListNode link) {
		this.data = data;
		this.link = link;
	}
	public String getData() {
		return this.data;
	}
}
*/