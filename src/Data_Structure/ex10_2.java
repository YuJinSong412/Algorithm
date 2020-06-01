/*
package Data_Structure;

class StackNode{
	int data;
	StackNode link;
}

class LinkedStack{
	StackNode top;
	
	public boolean isEmpty() {
		return (top == null);
	}
	public void push(int item) {
		StackNode newNode = new StackNode();	//맞는지 확인하기.
		newNode.data  = item;
		if(isEmpty()) {
			newNode.link = null;
			top = newNode;
		}
		newNode.link = top;
		top = newNode;
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Stack is empty!!");
			return 0;
		}
		else {
			int item = top.data;
			top = top.link;
			return item;
		}
	}
}

class QNode3{
	int data;
	QNode3 link;
}

class LinkedQueue3{
	QNode3 rear,front;
	
	public LinkedQueue3() {
		rear = null;
		front = null;
	}
	public boolean isEmpty() {
		return (front == null);
	}
	public void enQueue(int item) {
		QNode3 newNode = new QNode3();
		newNode.data = item;
		newNode.link = null;
		if(isEmpty()) {
			front = newNode;
			rear = newNode;
		}
		else {
			rear.link = newNode;
			rear = newNode;
		}
	}
	public int deQueue() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Queue is empty!!");
			return 0;
		}
		else {
			int item = front.data;
			front = front.link;
			if(front==null)
				rear = null;
			return item;
		}
	}
}

class GraphNode{
	int vertex;
	GraphNode link;
}
class AdjList{
	GraphNode[] head;
	private int totalV = 0;
	public AdjList() {
		head = new GraphNode[10];   //지금 할당해도 맞는지 확인하기.(맞음)
	}
	public void insertVertex(int i) {
		totalV++;
	}
	public void insertEdge(int v1, int v2) {
		if(v1>=totalV || v2>= totalV)
			System.out.println("그래프에 없는 정점입니다!!");
		else {
			GraphNode newNode = new GraphNode();
			newNode.vertex = v2;
			newNode.link = head[v1];
			head[v1] = newNode;
		}
	}
	public void printAdjList() {
		GraphNode temp = new GraphNode();
		for(int i=0;i<totalV;i++) {
			System.out.printf("\n정점 %c의 인접리스트 ", i+65);
			temp = head[i];
			while(temp != null) {
				System.out.printf("-> %c ", temp.vertex+65);
				temp = temp.link;
			}
		}
	}
	
	public void DFS(int v) {
		GraphNode w = new GraphNode();
		LinkedStack s = new LinkedStack();
		boolean visited[] = new boolean[10];
		s.push(v);
		visited[v] = true;
		System.out.printf(" %c",v+65);
		while(s.top != null) {
			w = head[v];
			while(w != null) {
				if(visited[w.vertex]==false) {
					s.push(w.vertex);
					visited[w.vertex] = true;
					System.out.printf(" %c", w.vertex+65);
					v = w.vertex;
					w= head[v];
				}
				else w = w.link;
			}
			v = s.pop();
		}
	}
	
	public void BFS(int v) {
		GraphNode w = new GraphNode();
		LinkedQueue3 Q = new LinkedQueue3();
		boolean visited[] = new boolean[10];
		
		Q.enQueue(v);
		visited[v] = true;
		System.out.printf(" %c",v+65);
		
		while(! Q.isEmpty()) {
			v = Q.deQueue();
			for(w=head[v];w != null;w=w.link) {
				if(visited[w.vertex] ==false) {
					visited[w.vertex] =true;
					System.out.printf(" %c", w.vertex+65);
					Q.enQueue(w.vertex);
				}
			}
		}
		
	}
}

public class ex10_2 {

	public static void main(String[] args) {
		AdjList G9 = new AdjList();
		
		for(int i=0;i<7;i++)
			G9.insertVertex(i);
		
		G9.insertEdge(0,2);
		G9.insertEdge(0,1);
		G9.insertEdge(1,4);
		G9.insertEdge(1,3);
		G9.insertEdge(1,0);
		G9.insertEdge(2,4);
		G9.insertEdge(2,0);
		G9.insertEdge(3,6);
		G9.insertEdge(3,1);
		G9.insertEdge(4,6);
		G9.insertEdge(4,2);
		G9.insertEdge(4,1);
		G9.insertEdge(5,6);
		G9.insertEdge(6,5);
		G9.insertEdge(6,4);
		G9.insertEdge(6,3);
		System.out.printf("\n 그래프 G9의 인접리스트 : ");
		G9.printAdjList();
		
		System.out.printf("\n\n 깊이우선탐색 >>> ");
		G9.DFS(0);
		
		System.out.printf("\n\n 너비우선탐색 >>> ");
		G9.BFS(0);
		
	}

}
*/