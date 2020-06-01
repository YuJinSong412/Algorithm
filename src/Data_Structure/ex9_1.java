/*
package Data_Structure;

class TreeNode{
	Object data;
	TreeNode left;
	TreeNode right;
	
}

class LinkedTree{
	private TreeNode root;
	
	public TreeNode makeBT(TreeNode left, Object data, TreeNode right) {
		TreeNode root = new TreeNode();
		root.data = data;
		root.left=left;
		root.right=right;
		return root;
	}
	
	public void preOrder(TreeNode root) {
		if(root != null) {
			System.out.printf("%c",root.data);
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	public void inOrder(TreeNode root) {
		if(root != null) {
			inOrder(root.left);
			System.out.printf("%c", root.data);
			inOrder(root.right);
		}
	}
	public void postOrder(TreeNode root) {
		if(root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.printf("%c", root.data);
		}
	}
}
public class ex9_1 {

	public static void main(String[] args) {
		LinkedTree T = new LinkedTree();
		
		TreeNode n4 = T.makeBT(null,'A',null);
		TreeNode n5 = T.makeBT(null,'B',null);
		TreeNode n6 = T.makeBT(null,'C',null);
		TreeNode n7 = T.makeBT(null,'D',null);
		TreeNode n3 = T.makeBT(n6,'/',n7);
		TreeNode n2 = T.makeBT(n4,'*',n5);
		TreeNode n1 = T.makeBT(n2,'-',n3);
		
		T.preOrder(n1);
		T.inOrder(n1);
		T.postOrder(n1);

	}

}
*/