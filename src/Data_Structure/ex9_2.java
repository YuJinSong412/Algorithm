package Data_Structure;

class TreeNode{
	char data;
	TreeNode left;
	TreeNode right;
}


class BinarySearchTree{
	public TreeNode root;
	
	public TreeNode makeT(TreeNode left, char data, TreeNode right) {
		root = new TreeNode();
		root.data = data;
		root.left = left;
		root.right = right;
		return root;
	}
	public void inOrder(TreeNode root) {
		if(root != null) {
			inOrder(root.left);
			System.out.printf("%c  ", root.data);
			inOrder(root.right);
		}
	}
	
	public void printBST(TreeNode root) {
		inOrder(root);
		System.out.println();
	}
	public TreeNode searchBST(char data) {
		TreeNode p = root;
		while(p != null) {
			if(data<p.data) 
				p = p.left;
			else if(data>p.data)
				p=p.right;
			else 
				return p;
		}
		return p;
	}
}
public class ex9_2 {

	public static void main(String[] args) {
		BinarySearchTree bsT = new BinarySearchTree();
		
		TreeNode n11 = bsT.makeT(null,'Q',null);
		TreeNode n10 = bsT.makeT(null,'N',n11);
		TreeNode n9 = bsT.makeT(null,'J',null);
		TreeNode n8 = bsT.makeT(null,'A',null);
		TreeNode n7 = bsT.makeT(n9,'M',n10);
		TreeNode n6 = bsT.makeT(null,'H',null);
		TreeNode n5 = bsT.makeT(null,'E',null);
		TreeNode n4 = bsT.makeT(n8,'B',null);
		TreeNode n3 = bsT.makeT(n6,'I',n7);
		TreeNode n2 = bsT.makeT(n4,'D',n5);
		TreeNode n1 = bsT.makeT(n2,'G',n3);
		
		System.out.printf("\nBinary Tree >>> ");
		bsT.printBST(n1);

		System.out.printf("Is There \"A\" ? >>> ");
		TreeNode p1 = bsT.searchBST('A');
		if(p1 != null)
			System.out.printf("Searching Success! Searched Key : %c \n",p1.data);
		else
			System.out.printf("Searching fail!! There is no %c \n", p1.data);
	}

}
